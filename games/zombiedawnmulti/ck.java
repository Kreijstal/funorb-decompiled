/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static String field_b;
    static String field_c;
    static int field_a;

    final static void a(int param0, int param1) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -23838) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            var2 = new int[rb.field_c.length + 1];
            var3 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (rb.field_c.length <= var3) {
                    break L4;
                  } else {
                    var2[var3] = rb.field_c[var3];
                    var3++;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var2[var2.length - 1] = param0;
                rb.field_c = var2;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2_ref, "ck.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        ga var1 = null;
        int var2 = 0;
        dm var3_ref_dm = null;
        int var3 = 0;
        long var3_long = 0L;
        jh var3_ref_jh = null;
        jh var4 = null;
        int var4_int = 0;
        String var5 = null;
        int var5_int = 0;
        jh var5_ref = null;
        dm var5_ref2 = null;
        String var6 = null;
        dm var6_ref = null;
        jh var6_ref2 = null;
        String var7 = null;
        dm var7_ref = null;
        dm var8_ref_dm = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_16_0 = 0;
        dm stackIn_22_0 = null;
        dm stackIn_23_0 = null;
        dm stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        dm stackIn_118_0 = null;
        dm stackIn_119_0 = null;
        dm stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        boolean stackIn_168_0 = false;
        boolean stackIn_169_0 = false;
        int stackIn_179_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        dm stackOut_21_0 = null;
        dm stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        dm stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        dm stackOut_117_0 = null;
        dm stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        dm stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        boolean stackOut_167_0 = false;
        boolean stackOut_168_0 = false;
        int stackOut_178_0 = 0;
        L0: {
          var11 = ZombieDawnMulti.field_E ? 1 : 0;
          var1 = s.field_e;
          var2 = ((k) (Object) var1).g(31365);
          if (param0 == -2061) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (var2 == 0) {
                break L3;
              } else {
                if (var2 == 1) {
                  break L3;
                } else {
                  if (var2 == 2) {
                    break L3;
                  } else {
                    if (3 == var2) {
                      break L3;
                    } else {
                      if (4 == var2) {
                        break L3;
                      } else {
                        L4: {
                          if (var2 != 5) {
                            break L4;
                          } else {
                            L5: {
                              var3_long = ((k) (Object) var1).a((byte) -30);
                              var5 = ((k) (Object) var1).f((byte) -76);
                              var6 = ((k) (Object) var1).f((byte) -50);
                              var7 = ((k) (Object) var1).f((byte) -61);
                              var8_ref_dm = en.a((byte) 50, var3_long);
                              if (var6.equals((Object) (Object) "")) {
                                stackOut_15_0 = 0;
                                stackIn_16_0 = stackOut_15_0;
                                break L5;
                              } else {
                                stackOut_14_0 = 1;
                                stackIn_16_0 = stackOut_14_0;
                                break L5;
                              }
                            }
                            L6: {
                              L7: {
                                var9 = stackIn_16_0;
                                if (null != var8_ref_dm) {
                                  break L7;
                                } else {
                                  var8_ref_dm = new dm(var5, var7, var3_long);
                                  hq.field_c.a(param0 + 2060, (qa) (Object) var8_ref_dm, var3_long);
                                  if (var11 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              if (var9 == 0) {
                                break L6;
                              } else {
                                var8_ref_dm.a(var5, var7, 43);
                                break L6;
                              }
                            }
                            L8: {
                              var8_ref_dm.field_Kb = bl.a((byte) 98) - (long)((k) (Object) var1).i(-1478490344);
                              var8_ref_dm.field_Mb = ((k) (Object) var1).d((byte) 69);
                              var10 = ((k) (Object) var1).a(param0 ^ -2061);
                              stackOut_21_0 = (dm) var8_ref_dm;
                              stackIn_23_0 = stackOut_21_0;
                              stackIn_22_0 = stackOut_21_0;
                              if ((1 & var10) == 0) {
                                stackOut_23_0 = (dm) (Object) stackIn_23_0;
                                stackOut_23_1 = 0;
                                stackIn_24_0 = stackOut_23_0;
                                stackIn_24_1 = stackOut_23_1;
                                break L8;
                              } else {
                                stackOut_22_0 = (dm) (Object) stackIn_22_0;
                                stackOut_22_1 = 1;
                                stackIn_24_0 = stackOut_22_0;
                                stackIn_24_1 = stackOut_22_1;
                                break L8;
                              }
                            }
                            stackIn_24_0.field_Nb = stackIn_24_1 != 0;
                            var8_ref_dm.field_Sb = var10 >> -178928735;
                            var8_ref_dm.field_Yb = ((k) (Object) var1).g(31365);
                            var8_ref_dm.field_Vb = ((k) (Object) var1).g(param0 + 33426);
                            lf.a(var8_ref_dm, true);
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L9: {
                          if (6 != var2) {
                            break L9;
                          } else {
                            L10: {
                              var3_long = ((k) (Object) var1).a((byte) -30);
                              var5_int = ((k) (Object) var1).g(31365);
                              var6_ref = en.a((byte) 50, var3_long);
                              if (var6_ref != null) {
                                L11: {
                                  if (!var6_ref.field_Ob) {
                                    break L11;
                                  } else {
                                    cb.field_i = cb.field_i - 1;
                                    var6_ref.field_Ob = false;
                                    break L11;
                                  }
                                }
                                L12: {
                                  L13: {
                                    if (0 != var5_int) {
                                      break L13;
                                    } else {
                                      var6_ref.a(true);
                                      if (var11 == 0) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  var6_ref.field_bc = so.field_r;
                                  var6_ref.field_Fb = var5_int;
                                  break L12;
                                }
                                var6_ref.a(-4564);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L14: {
                          if (7 == var2) {
                            break L14;
                          } else {
                            L15: {
                              if (var2 == 8) {
                                break L15;
                              } else {
                                L16: {
                                  if (var2 == 9) {
                                    break L16;
                                  } else {
                                    L17: {
                                      if (var2 == 10) {
                                        break L17;
                                      } else {
                                        L18: {
                                          L19: {
                                            if (var2 == 11) {
                                              break L19;
                                            } else {
                                              if (var2 != 12) {
                                                break L18;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          L20: {
                                            var3 = ((k) (Object) var1).d((byte) 69);
                                            var4 = (jh) (Object) af.field_h.a((long)var3, -22877);
                                            if (var4 != null) {
                                              L21: {
                                                L22: {
                                                  if (var2 == 11) {
                                                    break L22;
                                                  } else {
                                                    var4.field_rc = true;
                                                    if (var11 == 0) {
                                                      break L21;
                                                    } else {
                                                      break L22;
                                                    }
                                                  }
                                                }
                                                var4.field_lc = true;
                                                break L21;
                                              }
                                              mi.a(var4, -126);
                                              break L20;
                                            } else {
                                              break L20;
                                            }
                                          }
                                          if (var11 == 0) {
                                            break L2;
                                          } else {
                                            break L18;
                                          }
                                        }
                                        L23: {
                                          if (var2 == 13) {
                                            break L23;
                                          } else {
                                            L24: {
                                              if (var2 == 14) {
                                                break L24;
                                              } else {
                                                if (var2 == 16) {
                                                  break L24;
                                                } else {
                                                  L25: {
                                                    L26: {
                                                      if (var2 == 15) {
                                                        break L26;
                                                      } else {
                                                        if (var2 != 17) {
                                                          break L25;
                                                        } else {
                                                          break L26;
                                                        }
                                                      }
                                                    }
                                                    L27: {
                                                      var3_long = ((k) (Object) var1).a((byte) -30);
                                                      var5_int = ((k) (Object) var1).g(param0 + 33426);
                                                      var6_ref = en.a((byte) 50, var3_long);
                                                      if (var6_ref != null) {
                                                        L28: {
                                                          L29: {
                                                            if (var2 != 15) {
                                                              break L29;
                                                            } else {
                                                              var6_ref.field_Pb = false;
                                                              if (var11 == 0) {
                                                                break L28;
                                                              } else {
                                                                break L29;
                                                              }
                                                            }
                                                          }
                                                          if (var6_ref.field_Ob) {
                                                            var6_ref.field_Ob = false;
                                                            cb.field_i = cb.field_i - 1;
                                                            break L28;
                                                          } else {
                                                            break L28;
                                                          }
                                                        }
                                                        L30: {
                                                          if (var5_int != 0) {
                                                            var6_ref.field_bc = so.field_r;
                                                            var6_ref.field_Fb = var5_int;
                                                            break L30;
                                                          } else {
                                                            break L30;
                                                          }
                                                        }
                                                        lf.a(var6_ref, true);
                                                        break L27;
                                                      } else {
                                                        break L27;
                                                      }
                                                    }
                                                    if (var11 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L25;
                                                    }
                                                  }
                                                  L31: {
                                                    if (var2 == 18) {
                                                      break L31;
                                                    } else {
                                                      L32: {
                                                        if (var2 != 19) {
                                                          break L32;
                                                        } else {
                                                          L33: {
                                                            var3_long = ((k) (Object) var1).a((byte) -30);
                                                            var5_int = ((k) (Object) var1).g(31365);
                                                            var6_ref = vm.a(var3_long, (byte) -54);
                                                            if (var6_ref == null) {
                                                              break L33;
                                                            } else {
                                                              L34: {
                                                                L35: {
                                                                  if (var5_int == 0) {
                                                                    break L35;
                                                                  } else {
                                                                    var6_ref.field_Fb = var5_int;
                                                                    var6_ref.field_bc = so.field_r;
                                                                    if (var11 == 0) {
                                                                      break L34;
                                                                    } else {
                                                                      break L35;
                                                                    }
                                                                  }
                                                                }
                                                                var6_ref.a(true);
                                                                break L34;
                                                              }
                                                              var6_ref.a(param0 ^ 6623);
                                                              mh.field_c.field_cc = mh.field_c.field_cc - 1;
                                                              break L33;
                                                            }
                                                          }
                                                          if (var11 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L32;
                                                          }
                                                        }
                                                      }
                                                      L36: {
                                                        if (var2 == 20) {
                                                          break L36;
                                                        } else {
                                                          L37: {
                                                            if (var2 == 21) {
                                                              break L37;
                                                            } else {
                                                              L38: {
                                                                if (22 != var2) {
                                                                  break L38;
                                                                } else {
                                                                  bc.field_e = ((k) (Object) var1).d((byte) 69);
                                                                  dm.field_Zb = ((k) (Object) var1).a(param0 + 2061);
                                                                  if (var11 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L38;
                                                                  }
                                                                }
                                                              }
                                                              L39: {
                                                                if (var2 != 23) {
                                                                  break L39;
                                                                } else {
                                                                  ie.field_sb = ((k) (Object) var1).a((byte) -30);
                                                                  if (var11 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L39;
                                                                  }
                                                                }
                                                              }
                                                              bd.a("L1: " + ci.a(0), (Throwable) null, false);
                                                              ak.a((byte) -125);
                                                              if (var11 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L37;
                                                              }
                                                            }
                                                          }
                                                          L40: {
                                                            L41: {
                                                              var3 = ((k) (Object) var1).d((byte) 69);
                                                              if (var3 != 0) {
                                                                break L41;
                                                              } else {
                                                                qi.field_c = 0L;
                                                                if (var11 == 0) {
                                                                  break L40;
                                                                } else {
                                                                  break L41;
                                                                }
                                                              }
                                                            }
                                                            qi.field_c = bl.a((byte) 97) - -(long)var3;
                                                            break L40;
                                                          }
                                                          if (var11 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L36;
                                                          }
                                                        }
                                                      }
                                                      dl.a(mh.field_c, false, (k) (Object) var1, false);
                                                      if (var11 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L31;
                                                      }
                                                    }
                                                  }
                                                  L42: {
                                                    var3_long = ((k) (Object) var1).a((byte) -30);
                                                    var5 = ((k) (Object) var1).f((byte) -27);
                                                    var6 = ((k) (Object) var1).f((byte) -125);
                                                    var7_ref = vm.a(var3_long, (byte) -99);
                                                    if (null == var7_ref) {
                                                      var7_ref = new dm(var5, var6, var3_long);
                                                      kp.field_o.a(-1, (qa) (Object) var7_ref, var3_long);
                                                      mh.field_c.field_cc = mh.field_c.field_cc + 1;
                                                      break L42;
                                                    } else {
                                                      break L42;
                                                    }
                                                  }
                                                  L43: {
                                                    var7_ref.field_Mb = ((k) (Object) var1).d((byte) 69);
                                                    var8 = ((k) (Object) var1).a(0);
                                                    var7_ref.field_Sb = var8 >> 573625729;
                                                    stackOut_117_0 = (dm) var7_ref;
                                                    stackIn_119_0 = stackOut_117_0;
                                                    stackIn_118_0 = stackOut_117_0;
                                                    if ((1 & var8) == 0) {
                                                      stackOut_119_0 = (dm) (Object) stackIn_119_0;
                                                      stackOut_119_1 = 0;
                                                      stackIn_120_0 = stackOut_119_0;
                                                      stackIn_120_1 = stackOut_119_1;
                                                      break L43;
                                                    } else {
                                                      stackOut_118_0 = (dm) (Object) stackIn_118_0;
                                                      stackOut_118_1 = 1;
                                                      stackIn_120_0 = stackOut_118_0;
                                                      stackIn_120_1 = stackOut_118_1;
                                                      break L43;
                                                    }
                                                  }
                                                  stackIn_120_0.field_Nb = stackIn_120_1 != 0;
                                                  var7_ref.field_Yb = ((k) (Object) var1).g(31365);
                                                  var7_ref.field_Vb = ((k) (Object) var1).g(31365);
                                                  nh.field_g.a((br) (Object) var7_ref, false);
                                                  if (var11 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L24;
                                                  }
                                                }
                                              }
                                            }
                                            L44: {
                                              var3_long = ((k) (Object) var1).a((byte) -30);
                                              var5_ref2 = en.a((byte) 50, var3_long);
                                              if (var5_ref2 != null) {
                                                L45: {
                                                  L46: {
                                                    if (14 == var2) {
                                                      break L46;
                                                    } else {
                                                      if (var5_ref2.field_Ob) {
                                                        break L45;
                                                      } else {
                                                        cb.field_i = cb.field_i + 1;
                                                        var5_ref2.field_Ob = true;
                                                        if (var11 == 0) {
                                                          break L45;
                                                        } else {
                                                          break L46;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var5_ref2.field_Pb = true;
                                                  break L45;
                                                }
                                                lf.a(var5_ref2, true);
                                                break L44;
                                              } else {
                                                break L44;
                                              }
                                            }
                                            if (var11 == 0) {
                                              break L2;
                                            } else {
                                              break L23;
                                            }
                                          }
                                        }
                                        L47: {
                                          var3 = ((k) (Object) var1).d((byte) 69);
                                          var4_int = ((k) (Object) var1).g(param0 + 33426);
                                          var5_ref = (jh) (Object) af.field_h.a((long)var3, -22877);
                                          if (null == var5_ref) {
                                            break L47;
                                          } else {
                                            L48: {
                                              var6_ref2 = var5_ref;
                                              var5_ref.field_rc = false;
                                              if (var4_int == 0) {
                                                break L48;
                                              } else {
                                                var5_ref.field_Jb = so.field_r;
                                                var5_ref.field_Vb = var4_int;
                                                break L48;
                                              }
                                            }
                                            var6_ref2.field_lc = false;
                                            mi.a(var5_ref, -57);
                                            break L47;
                                          }
                                        }
                                        if (var11 == 0) {
                                          break L2;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    var3_ref_jh = (jh) (Object) tn.field_C.c(param0 + 2175);
                                    L49: while (true) {
                                      L50: {
                                        if (null == var3_ref_jh) {
                                          break L50;
                                        } else {
                                          var3_ref_jh.a(true);
                                          var3_ref_jh.a(param0 ^ 6623);
                                          var3_ref_jh = (jh) (Object) tn.field_C.b(param0 + 2067);
                                          if (var11 != 0) {
                                            break L2;
                                          } else {
                                            if (var11 == 0) {
                                              continue L49;
                                            } else {
                                              break L50;
                                            }
                                          }
                                        }
                                      }
                                      if (var11 == 0) {
                                        break L2;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                                L51: {
                                  var3 = ((k) (Object) var1).d((byte) 69);
                                  var4_int = ((k) (Object) var1).g(31365);
                                  var5_ref = (jh) (Object) af.field_h.a((long)var3, -22877);
                                  if (null != var5_ref) {
                                    L52: {
                                      L53: {
                                        if (var4_int == 0) {
                                          break L53;
                                        } else {
                                          var5_ref.field_Jb = so.field_r;
                                          var5_ref.field_Vb = var4_int;
                                          if (var11 == 0) {
                                            break L52;
                                          } else {
                                            break L53;
                                          }
                                        }
                                      }
                                      var5_ref.a(true);
                                      break L52;
                                    }
                                    var5_ref.a(-4564);
                                    break L51;
                                  } else {
                                    break L51;
                                  }
                                }
                                if (var11 == 0) {
                                  break L2;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            L54: {
                              var3 = ((k) (Object) var1).d((byte) 69);
                              var4 = (jh) (Object) af.field_h.a((long)var3, -22877);
                              if (null != var4) {
                                break L54;
                              } else {
                                var4 = new jh(kj.field_h);
                                af.field_h.a(-1, (qa) (Object) var4, (long)var3);
                                break L54;
                              }
                            }
                            dl.a(var4, true, (k) (Object) var1, false);
                            mi.a(var4, param0 ^ 2144);
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L14;
                            }
                          }
                        }
                        var3_ref_dm = (dm) (Object) cg.field_i.c(66);
                        L55: while (true) {
                          L56: {
                            L57: {
                              if (var3_ref_dm == null) {
                                break L57;
                              } else {
                                var3_ref_dm.a(true);
                                var3_ref_dm.a(-4564);
                                var3_ref_dm = (dm) (Object) cg.field_i.b(param0 + 2067);
                                if (var11 != 0) {
                                  break L56;
                                } else {
                                  if (var11 == 0) {
                                    continue L55;
                                  } else {
                                    break L57;
                                  }
                                }
                              }
                            }
                            cb.field_i = 0;
                            break L56;
                          }
                          if (var11 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            var3_ref_dm = (dm) (Object) nh.field_g.c(113);
            L58: while (true) {
              L59: {
                L60: {
                  if (var3_ref_dm == null) {
                    break L60;
                  } else {
                    var3_ref_dm.a(true);
                    var3_ref_dm.a(-4564);
                    var3_ref_dm = (dm) (Object) nh.field_g.b(6);
                    if (var11 != 0) {
                      break L59;
                    } else {
                      if (var11 == 0) {
                        continue L58;
                      } else {
                        break L60;
                      }
                    }
                  }
                }
                var3_ref_dm = (dm) (Object) hq.field_c.a((byte) 7);
                break L59;
              }
              L61: while (true) {
                L62: {
                  L63: {
                    if (null == var3_ref_dm) {
                      break L63;
                    } else {
                      stackOut_167_0 = var3_ref_dm.field_Pb;
                      stackIn_179_0 = stackOut_167_0 ? 1 : 0;
                      stackIn_168_0 = stackOut_167_0;
                      if (var11 != 0) {
                        break L62;
                      } else {
                        stackOut_168_0 = stackIn_168_0;
                        stackIn_169_0 = stackOut_168_0;
                        L64: {
                          L65: {
                            if (stackIn_169_0) {
                              break L65;
                            } else {
                              if (var3_ref_dm.field_Ob) {
                                break L65;
                              } else {
                                break L64;
                              }
                            }
                          }
                          L66: {
                            if (!var3_ref_dm.field_Ob) {
                              break L66;
                            } else {
                              cb.field_i = cb.field_i - 1;
                              var3_ref_dm.field_Ob = false;
                              break L66;
                            }
                          }
                          var3_ref_dm.field_Pb = false;
                          lf.a(var3_ref_dm, true);
                          break L64;
                        }
                        var3_ref_dm = (dm) (Object) hq.field_c.c((byte) 123);
                        if (var11 == 0) {
                          continue L61;
                        } else {
                          break L63;
                        }
                      }
                    }
                  }
                  stackOut_178_0 = -2;
                  stackIn_179_0 = stackOut_178_0;
                  break L62;
                }
                L67: {
                  if (stackIn_179_0 != ~var2) {
                    break L67;
                  } else {
                    if (null == mh.field_c) {
                      break L67;
                    } else {
                      sb.field_k = mh.field_c.field_Nb;
                      break L67;
                    }
                  }
                }
                L68: {
                  L69: {
                    if (var2 == 4) {
                      break L69;
                    } else {
                      mh.field_c = null;
                      if (var11 == 0) {
                        break L68;
                      } else {
                        break L69;
                      }
                    }
                  }
                  var3 = ((k) (Object) var1).d((byte) 69);
                  mh.field_c = new jh(kj.field_h);
                  mh.field_c.a((byte) -85, (long)var3);
                  dl.a(mh.field_c, false, (k) (Object) var1, false);
                  qi.field_c = 0L;
                  break L68;
                }
                L70: {
                  L71: {
                    L72: {
                      if (var2 == 2) {
                        break L72;
                      } else {
                        if (var2 != 3) {
                          break L71;
                        } else {
                          break L72;
                        }
                      }
                    }
                    if (null != ej.field_n) {
                      break L70;
                    } else {
                      ej.field_n = new jh(kj.field_h);
                      if (var11 == 0) {
                        break L70;
                      } else {
                        break L71;
                      }
                    }
                  }
                  ej.field_n = null;
                  break L70;
                }
                L73: {
                  if (var2 == 3) {
                    break L73;
                  } else {
                    la.field_k = false;
                    if (var11 == 0) {
                      break L2;
                    } else {
                      break L73;
                    }
                  }
                }
                la.field_k = true;
                var3 = 0;
                L74: while (true) {
                  L75: {
                    L76: {
                      if (~fg.field_k.length >= ~var3) {
                        break L76;
                      } else {
                        fg.field_k[var3] = ((k) (Object) var1).d(param0 + -249697519);
                        var3++;
                        if (var11 != 0) {
                          break L75;
                        } else {
                          if (var11 == 0) {
                            continue L74;
                          } else {
                            break L76;
                          }
                        }
                      }
                    }
                    pb.field_h = ((k) (Object) var1).g(31365);
                    sc.field_f = ((k) (Object) var1).g(31365);
                    break L75;
                  }
                  var3 = 0;
                  L77: while (true) {
                    if (~var3 <= ~tg.field_a.length) {
                      break L2;
                    } else {
                      tg.field_a[var3] = ((k) (Object) var1).d(-249699580);
                      var3++;
                      if (var11 != 0) {
                        break L1;
                      } else {
                        if (var11 == 0) {
                          continue L77;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          break L1;
        }
    }

    final static boolean a(char param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            if (!lo.a(8192, param0)) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0 != 0;
            } else {
              if (param2 != null) {
                var3_int = param2.length();
                if (var3_int < 12) {
                  L2: {
                    if (eb.a((byte) 64, param0)) {
                      if (var3_int == 0) {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0 != 0;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  stackOut_22_0 = 1;
                  stackIn_23_0 = stackOut_22_0;
                  break L0;
                } else {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0 != 0;
                }
              } else {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("ck.A(").append(param0).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L3;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
        return stackIn_23_0 != 0;
    }

    public static void b(int param0) {
        try {
            field_c = null;
            int var1_int = -20 % ((param0 - 40) / 63);
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ck.B(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "OVER <%0>";
        field_b = "Players";
        field_a = 0;
    }
}
