/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm extends gn {
    static int field_e;
    byte[] field_k;
    static ut[] field_i;
    static int field_h;
    int field_j;
    long field_f;
    static ot field_g;

    final static og a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            og var5 = null;
            dh var5_ref = null;
            og stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            og stackOut_2_0 = null;
            try {
              L0: {
                L1: {
                  if (param0 >= 49) {
                    break L1;
                  } else {
                    jm.a(93, true, 85);
                    break L1;
                  }
                }
                var4 = Class.forName("pm");
                var5 = (og) var4.newInstance();
                var5.a(30, param1, param2, param3);
                stackOut_2_0 = (og) var5;
                stackIn_3_0 = stackOut_2_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new dh();
              ((og) (Object) var5_ref).a(30, param1, param2, param3);
              return (og) (Object) var5_ref;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0) {
        if (param0 <= 25) {
            jm.a(111);
            pc.field_c = nj.a(82);
            cv.field_d = 0;
            return;
        }
        pc.field_c = nj.a(82);
        cv.field_d = 0;
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_186_0 = 0;
        int stackIn_248_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_247_0 = 0;
        int stackOut_246_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_184_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_103_0 = 0;
        L0: {
          var6 = Kickabout.field_G;
          if (null != ra.field_G) {
            cv.a((byte) 78);
            break L0;
          } else {
            break L0;
          }
        }
        if (cq.field_h.field_c != param0) {
          L1: {
            if (!(cq.field_h instanceof ta)) {
              break L1;
            } else {
              if (!nb.a(param2 + 66)) {
                break L1;
              } else {
                og.a(false);
                return;
              }
            }
          }
          L2: {
            if (cq.field_h instanceof ap) {
              ra.field_G = lg.a(param0, 24939);
              if (26 == cq.field_h.field_c) {
                if (ra.field_G instanceof ap) {
                  break L2;
                } else {
                  if (la.a(param2 ^ -102)) {
                    break L2;
                  } else {
                    or.field_d.b(91, (byte) 114);
                    break L2;
                  }
                }
              } else {
                ra.field_G = lg.a(param0, 24939);
                if (26 != cq.field_h.field_c) {
                  break L2;
                } else {
                  if (ra.field_G instanceof ap) {
                    break L2;
                  } else {
                    if (la.a(param2 ^ -102)) {
                      break L2;
                    } else {
                      or.field_d.b(91, (byte) 114);
                      break L2;
                    }
                  }
                }
              }
            } else {
              ra.field_G = lg.a(param0, 24939);
              if (26 == cq.field_h.field_c) {
                if (ra.field_G instanceof ap) {
                  break L2;
                } else {
                  if (la.a(param2 ^ -102)) {
                    break L2;
                  } else {
                    or.field_d.b(91, (byte) 114);
                    break L2;
                  }
                }
              } else {
                ra.field_G = lg.a(param0, 24939);
                if (26 != cq.field_h.field_c) {
                  break L2;
                } else {
                  if (ra.field_G instanceof ap) {
                    break L2;
                  } else {
                    if (la.a(param2 ^ -102)) {
                      break L2;
                    } else {
                      or.field_d.b(91, (byte) 114);
                      break L2;
                    }
                  }
                }
              }
            }
          }
          L3: {
            if (-13 != (cq.field_h.field_c ^ -1)) {
              break L3;
            } else {
              L4: {
                if (sk.a((byte) 97) != tu.field_E.field_p) {
                  break L4;
                } else {
                  if (gn.b((byte) -110) != tu.field_E.field_F) {
                    break L4;
                  } else {
                    L5: {
                      if (tu.field_E.field_A) {
                        stackOut_31_0 = 0;
                        stackIn_32_0 = stackOut_31_0;
                        break L5;
                      } else {
                        stackOut_30_0 = 1;
                        stackIn_32_0 = stackOut_30_0;
                        break L5;
                      }
                    }
                    if (stackIn_32_0 == (ei.field_n ? 1 : 0)) {
                      break L4;
                    } else {
                      L6: {
                        if (tu.field_E.field_d) {
                          stackOut_35_0 = 0;
                          stackIn_36_0 = stackOut_35_0;
                          break L6;
                        } else {
                          stackOut_34_0 = 1;
                          stackIn_36_0 = stackOut_34_0;
                          break L6;
                        }
                      }
                      L7: {
                        stackOut_36_0 = stackIn_36_0;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_37_0 = stackOut_36_0;
                        if (pf.field_c) {
                          stackOut_38_0 = stackIn_38_0;
                          stackOut_38_1 = 0;
                          stackIn_39_0 = stackOut_38_0;
                          stackIn_39_1 = stackOut_38_1;
                          break L7;
                        } else {
                          stackOut_37_0 = stackIn_37_0;
                          stackOut_37_1 = 1;
                          stackIn_39_0 = stackOut_37_0;
                          stackIn_39_1 = stackOut_37_1;
                          break L7;
                        }
                      }
                      if (stackIn_39_0 != stackIn_39_1) {
                        break L4;
                      } else {
                        L8: {
                          if (-2 != (tb.field_v ^ -1)) {
                            break L8;
                          } else {
                            if (!tu.field_E.field_L) {
                              break L4;
                            } else {
                              break L8;
                            }
                          }
                        }
                        if (tb.field_v != 0) {
                          break L3;
                        } else {
                          if (tu.field_E.field_L) {
                            break L4;
                          } else {
                            L9: {
                              if (param2 == -2) {
                                break L9;
                              } else {
                                field_e = -71;
                                break L9;
                              }
                            }
                            L10: {
                              if (!(cq.field_h instanceof qt)) {
                                ra.field_G.field_b = cq.field_h.field_c;
                                break L10;
                              } else {
                                if (!(ra.field_G instanceof qt)) {
                                  ra.field_G.field_b = cq.field_h.field_c;
                                  break L10;
                                } else {
                                  if (((qt) (Object) ra.field_G).a((qt) (Object) cq.field_h, -4319)) {
                                    break L10;
                                  } else {
                                    ra.field_G.field_b = cq.field_h.field_c;
                                    break L10;
                                  }
                                }
                              }
                            }
                            L11: {
                              L12: {
                                if (!(cq.field_h instanceof qt)) {
                                  break L12;
                                } else {
                                  if (!(ra.field_G instanceof qt)) {
                                    break L12;
                                  } else {
                                    L13: {
                                      if (!((qt) (Object) ra.field_G).a((qt) (Object) cq.field_h, -4319)) {
                                        stackOut_58_0 = 55;
                                        stackIn_59_0 = stackOut_58_0;
                                        break L13;
                                      } else {
                                        stackOut_57_0 = 56;
                                        stackIn_59_0 = stackOut_57_0;
                                        break L13;
                                      }
                                    }
                                    var3 = stackIn_59_0;
                                    wh discarded$24 = sp.c(var3, -119);
                                    break L11;
                                  }
                                }
                              }
                              if (ra.field_G instanceof qt) {
                                if (!(cq.field_h instanceof qt)) {
                                  if (!(ra.field_G instanceof qt)) {
                                    break L11;
                                  } else {
                                    wh discarded$25 = sp.c(56, 49);
                                    break L11;
                                  }
                                } else {
                                  if (cq.field_h instanceof qt) {
                                    break L11;
                                  } else {
                                    if (!(ra.field_G instanceof qt)) {
                                      break L11;
                                    } else {
                                      wh discarded$26 = sp.c(56, 49);
                                      break L11;
                                    }
                                  }
                                }
                              } else {
                                if (cq.field_h instanceof qt) {
                                  break L11;
                                } else {
                                  if (!(ra.field_G instanceof qt)) {
                                    break L11;
                                  } else {
                                    wh discarded$27 = sp.c(56, 49);
                                    break L11;
                                  }
                                }
                              }
                            }
                            L14: {
                              ce.field_I = 0;
                              if (!(ra.field_G instanceof bd)) {
                                if (ra.field_G instanceof qt) {
                                  ((qt) (Object) ra.field_G).a(param2 + 2, 0, param1);
                                  break L14;
                                } else {
                                  break L14;
                                }
                              } else {
                                ((qt) (Object) ra.field_G).a(0, -1, param1);
                                eq.a(1, param1);
                                break L14;
                              }
                            }
                            return;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L15: {
                var3 = 0;
                if (ei.field_n) {
                  var3 = var3 | 1;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if ((tb.field_v ^ -1) != -2) {
                  break L16;
                } else {
                  var3 = var3 | 2;
                  break L16;
                }
              }
              L17: {
                if (!pf.field_c) {
                  break L17;
                } else {
                  var3 = var3 | 4;
                  break L17;
                }
              }
              L18: {
                var4 = gn.b((byte) -65);
                if (255 >= var4) {
                  break L18;
                } else {
                  var4 = 255;
                  break L18;
                }
              }
              L19: {
                var5 = sk.a((byte) 97);
                if (-256 <= (var5 ^ -1)) {
                  break L19;
                } else {
                  var5 = 255;
                  break L19;
                }
              }
              L20: {
                if (!la.a(100)) {
                  or.field_d.b(65, (byte) 119);
                  or.field_d.a(103, var5);
                  or.field_d.a(param2 ^ -113, var4);
                  or.field_d.a(param2 + 119, var3);
                  break L20;
                } else {
                  break L20;
                }
              }
              tu.field_E.field_p = sk.a((byte) 97);
              tu.field_E.field_F = gn.b((byte) -95);
              tu.field_E.field_d = pf.field_c;
              tu.field_E.field_A = ei.field_n;
              break L3;
            }
          }
          if (param2 == -2) {
            if (!(cq.field_h instanceof qt)) {
              ra.field_G.field_b = cq.field_h.field_c;
              if (cq.field_h instanceof qt) {
                if (!(ra.field_G instanceof qt)) {
                  L21: {
                    L22: {
                      if (ra.field_G instanceof qt) {
                        break L22;
                      } else {
                        if (!(cq.field_h instanceof qt)) {
                          break L22;
                        } else {
                          wh discarded$28 = sp.c(55, 22);
                          break L21;
                        }
                      }
                    }
                    if (cq.field_h instanceof qt) {
                      break L21;
                    } else {
                      if (!(ra.field_G instanceof qt)) {
                        break L21;
                      } else {
                        wh discarded$29 = sp.c(56, 49);
                        break L21;
                      }
                    }
                  }
                  L23: {
                    ce.field_I = 0;
                    if (!(ra.field_G instanceof bd)) {
                      if (ra.field_G instanceof qt) {
                        ((qt) (Object) ra.field_G).a(param2 + 2, 0, param1);
                        break L23;
                      } else {
                        break L23;
                      }
                    } else {
                      ((qt) (Object) ra.field_G).a(0, -1, param1);
                      eq.a(1, param1);
                      break L23;
                    }
                  }
                  return;
                } else {
                  L24: {
                    if (!((qt) (Object) ra.field_G).a((qt) (Object) cq.field_h, -4319)) {
                      stackOut_161_0 = 55;
                      stackIn_162_0 = stackOut_161_0;
                      break L24;
                    } else {
                      stackOut_160_0 = 56;
                      stackIn_162_0 = stackOut_160_0;
                      break L24;
                    }
                  }
                  L25: {
                    var3 = stackIn_162_0;
                    wh discarded$30 = sp.c(var3, -119);
                    ce.field_I = 0;
                    if (!(ra.field_G instanceof bd)) {
                      if (ra.field_G instanceof qt) {
                        ((qt) (Object) ra.field_G).a(param2 + 2, 0, param1);
                        break L25;
                      } else {
                        break L25;
                      }
                    } else {
                      ((qt) (Object) ra.field_G).a(0, -1, param1);
                      eq.a(1, param1);
                      break L25;
                    }
                  }
                  return;
                }
              } else {
                L26: {
                  L27: {
                    if (ra.field_G instanceof qt) {
                      break L27;
                    } else {
                      if (!(cq.field_h instanceof qt)) {
                        break L27;
                      } else {
                        wh discarded$31 = sp.c(55, 22);
                        break L26;
                      }
                    }
                  }
                  if (cq.field_h instanceof qt) {
                    break L26;
                  } else {
                    if (!(ra.field_G instanceof qt)) {
                      break L26;
                    } else {
                      wh discarded$32 = sp.c(56, 49);
                      break L26;
                    }
                  }
                }
                L28: {
                  ce.field_I = 0;
                  if (!(ra.field_G instanceof bd)) {
                    if (ra.field_G instanceof qt) {
                      ((qt) (Object) ra.field_G).a(param2 + 2, 0, param1);
                      break L28;
                    } else {
                      break L28;
                    }
                  } else {
                    ((qt) (Object) ra.field_G).a(0, -1, param1);
                    eq.a(1, param1);
                    break L28;
                  }
                }
                return;
              }
            } else {
              if (ra.field_G instanceof qt) {
                if (((qt) (Object) ra.field_G).a((qt) (Object) cq.field_h, -4319)) {
                  if (cq.field_h instanceof qt) {
                    if (ra.field_G instanceof qt) {
                      L29: {
                        if (!((qt) (Object) ra.field_G).a((qt) (Object) cq.field_h, -4319)) {
                          stackOut_247_0 = 55;
                          stackIn_248_0 = stackOut_247_0;
                          break L29;
                        } else {
                          stackOut_246_0 = 56;
                          stackIn_248_0 = stackOut_246_0;
                          break L29;
                        }
                      }
                      var3 = stackIn_248_0;
                      wh discarded$33 = sp.c(var3, -119);
                      ce.field_I = 0;
                      if (!(ra.field_G instanceof bd)) {
                        if (ra.field_G instanceof qt) {
                          ((qt) (Object) ra.field_G).a(param2 + 2, 0, param1);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        ((qt) (Object) ra.field_G).a(0, -1, param1);
                        eq.a(1, param1);
                        return;
                      }
                    } else {
                      L30: {
                        if (ra.field_G instanceof qt) {
                          break L30;
                        } else {
                          if (!(cq.field_h instanceof qt)) {
                            break L30;
                          } else {
                            wh discarded$34 = sp.c(55, 22);
                            ce.field_I = 0;
                            if (!(ra.field_G instanceof bd)) {
                              if (!(ra.field_G instanceof qt)) {
                                return;
                              } else {
                                ((qt) (Object) ra.field_G).a(param2 + 2, 0, param1);
                                return;
                              }
                            } else {
                              ((qt) (Object) ra.field_G).a(0, -1, param1);
                              eq.a(1, param1);
                              return;
                            }
                          }
                        }
                      }
                      L31: {
                        if (cq.field_h instanceof qt) {
                          break L31;
                        } else {
                          if (!(ra.field_G instanceof qt)) {
                            break L31;
                          } else {
                            wh discarded$35 = sp.c(56, 49);
                            ce.field_I = 0;
                            if (!(ra.field_G instanceof bd)) {
                              if (!(ra.field_G instanceof qt)) {
                                return;
                              } else {
                                ((qt) (Object) ra.field_G).a(param2 + 2, 0, param1);
                                return;
                              }
                            } else {
                              ((qt) (Object) ra.field_G).a(0, -1, param1);
                              eq.a(1, param1);
                              return;
                            }
                          }
                        }
                      }
                      ce.field_I = 0;
                      if (!(ra.field_G instanceof bd)) {
                        if (!(ra.field_G instanceof qt)) {
                          return;
                        } else {
                          ((qt) (Object) ra.field_G).a(param2 + 2, 0, param1);
                          return;
                        }
                      } else {
                        ((qt) (Object) ra.field_G).a(0, -1, param1);
                        eq.a(1, param1);
                        return;
                      }
                    }
                  } else {
                    L32: {
                      if (ra.field_G instanceof qt) {
                        break L32;
                      } else {
                        if (!(cq.field_h instanceof qt)) {
                          break L32;
                        } else {
                          wh discarded$36 = sp.c(55, 22);
                          ce.field_I = 0;
                          if (!(ra.field_G instanceof bd)) {
                            if (!(ra.field_G instanceof qt)) {
                              return;
                            } else {
                              ((qt) (Object) ra.field_G).a(param2 + 2, 0, param1);
                              return;
                            }
                          } else {
                            ((qt) (Object) ra.field_G).a(0, -1, param1);
                            eq.a(1, param1);
                            return;
                          }
                        }
                      }
                    }
                    L33: {
                      if (cq.field_h instanceof qt) {
                        break L33;
                      } else {
                        if (!(ra.field_G instanceof qt)) {
                          break L33;
                        } else {
                          wh discarded$37 = sp.c(56, 49);
                          ce.field_I = 0;
                          if (!(ra.field_G instanceof bd)) {
                            if (!(ra.field_G instanceof qt)) {
                              return;
                            } else {
                              ((qt) (Object) ra.field_G).a(param2 + 2, 0, param1);
                              return;
                            }
                          } else {
                            ((qt) (Object) ra.field_G).a(0, -1, param1);
                            eq.a(1, param1);
                            return;
                          }
                        }
                      }
                    }
                    ce.field_I = 0;
                    if (!(ra.field_G instanceof bd)) {
                      if (!(ra.field_G instanceof qt)) {
                        return;
                      } else {
                        ((qt) (Object) ra.field_G).a(param2 + 2, 0, param1);
                        return;
                      }
                    } else {
                      ((qt) (Object) ra.field_G).a(0, -1, param1);
                      eq.a(1, param1);
                      return;
                    }
                  }
                } else {
                  L34: {
                    L35: {
                      ra.field_G.field_b = cq.field_h.field_c;
                      if (!(cq.field_h instanceof qt)) {
                        break L35;
                      } else {
                        if (!(ra.field_G instanceof qt)) {
                          break L35;
                        } else {
                          L36: {
                            if (!((qt) (Object) ra.field_G).a((qt) (Object) cq.field_h, -4319)) {
                              stackOut_185_0 = 55;
                              stackIn_186_0 = stackOut_185_0;
                              break L36;
                            } else {
                              stackOut_184_0 = 56;
                              stackIn_186_0 = stackOut_184_0;
                              break L36;
                            }
                          }
                          var3 = stackIn_186_0;
                          wh discarded$38 = sp.c(var3, -119);
                          break L34;
                        }
                      }
                    }
                    L37: {
                      if (ra.field_G instanceof qt) {
                        break L37;
                      } else {
                        if (!(cq.field_h instanceof qt)) {
                          break L37;
                        } else {
                          wh discarded$39 = sp.c(55, 22);
                          break L34;
                        }
                      }
                    }
                    if (cq.field_h instanceof qt) {
                      break L34;
                    } else {
                      if (!(ra.field_G instanceof qt)) {
                        break L34;
                      } else {
                        wh discarded$40 = sp.c(56, 49);
                        break L34;
                      }
                    }
                  }
                  L38: {
                    ce.field_I = 0;
                    if (!(ra.field_G instanceof bd)) {
                      if (ra.field_G instanceof qt) {
                        ((qt) (Object) ra.field_G).a(param2 + 2, 0, param1);
                        break L38;
                      } else {
                        break L38;
                      }
                    } else {
                      ((qt) (Object) ra.field_G).a(0, -1, param1);
                      eq.a(1, param1);
                      break L38;
                    }
                  }
                  return;
                }
              } else {
                L39: {
                  L40: {
                    ra.field_G.field_b = cq.field_h.field_c;
                    if (!(cq.field_h instanceof qt)) {
                      break L40;
                    } else {
                      if (!(ra.field_G instanceof qt)) {
                        break L40;
                      } else {
                        L41: {
                          if (!((qt) (Object) ra.field_G).a((qt) (Object) cq.field_h, -4319)) {
                            stackOut_129_0 = 55;
                            stackIn_130_0 = stackOut_129_0;
                            break L41;
                          } else {
                            stackOut_128_0 = 56;
                            stackIn_130_0 = stackOut_128_0;
                            break L41;
                          }
                        }
                        var3 = stackIn_130_0;
                        wh discarded$41 = sp.c(var3, -119);
                        break L39;
                      }
                    }
                  }
                  L42: {
                    if (ra.field_G instanceof qt) {
                      break L42;
                    } else {
                      if (!(cq.field_h instanceof qt)) {
                        break L42;
                      } else {
                        wh discarded$42 = sp.c(55, 22);
                        break L39;
                      }
                    }
                  }
                  if (cq.field_h instanceof qt) {
                    break L39;
                  } else {
                    if (!(ra.field_G instanceof qt)) {
                      break L39;
                    } else {
                      wh discarded$43 = sp.c(56, 49);
                      break L39;
                    }
                  }
                }
                L43: {
                  ce.field_I = 0;
                  if (!(ra.field_G instanceof bd)) {
                    if (ra.field_G instanceof qt) {
                      ((qt) (Object) ra.field_G).a(param2 + 2, 0, param1);
                      break L43;
                    } else {
                      break L43;
                    }
                  } else {
                    ((qt) (Object) ra.field_G).a(0, -1, param1);
                    eq.a(1, param1);
                    break L43;
                  }
                }
                return;
              }
            }
          } else {
            L44: {
              field_e = -71;
              if (!(cq.field_h instanceof qt)) {
                ra.field_G.field_b = cq.field_h.field_c;
                break L44;
              } else {
                if (!(ra.field_G instanceof qt)) {
                  ra.field_G.field_b = cq.field_h.field_c;
                  break L44;
                } else {
                  if (((qt) (Object) ra.field_G).a((qt) (Object) cq.field_h, -4319)) {
                    break L44;
                  } else {
                    ra.field_G.field_b = cq.field_h.field_c;
                    break L44;
                  }
                }
              }
            }
            L45: {
              L46: {
                if (!(cq.field_h instanceof qt)) {
                  break L46;
                } else {
                  if (!(ra.field_G instanceof qt)) {
                    break L46;
                  } else {
                    L47: {
                      if (!((qt) (Object) ra.field_G).a((qt) (Object) cq.field_h, -4319)) {
                        stackOut_104_0 = 55;
                        stackIn_105_0 = stackOut_104_0;
                        break L47;
                      } else {
                        stackOut_103_0 = 56;
                        stackIn_105_0 = stackOut_103_0;
                        break L47;
                      }
                    }
                    var3 = stackIn_105_0;
                    wh discarded$44 = sp.c(var3, -119);
                    break L45;
                  }
                }
              }
              if (ra.field_G instanceof qt) {
                if (!(cq.field_h instanceof qt)) {
                  if (!(ra.field_G instanceof qt)) {
                    break L45;
                  } else {
                    wh discarded$45 = sp.c(56, 49);
                    break L45;
                  }
                } else {
                  if (cq.field_h instanceof qt) {
                    break L45;
                  } else {
                    if (!(ra.field_G instanceof qt)) {
                      break L45;
                    } else {
                      wh discarded$46 = sp.c(56, 49);
                      break L45;
                    }
                  }
                }
              } else {
                if (cq.field_h instanceof qt) {
                  break L45;
                } else {
                  if (!(ra.field_G instanceof qt)) {
                    break L45;
                  } else {
                    wh discarded$47 = sp.c(56, 49);
                    break L45;
                  }
                }
              }
            }
            L48: {
              ce.field_I = 0;
              if (!(ra.field_G instanceof bd)) {
                if (ra.field_G instanceof qt) {
                  ((qt) (Object) ra.field_G).a(param2 + 2, 0, param1);
                  break L48;
                } else {
                  break L48;
                }
              } else {
                ((qt) (Object) ra.field_G).a(0, -1, param1);
                eq.a(1, param1);
                break L48;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        long var3 = 0L;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var3 = nj.a(-127);
        if (var3 >= up.field_b) {
          up.field_b = var3 + 25L;
          var5 = (float)param2 / (float)param0;
          var6 = vr.a(-2, rl.field_r);
          var7 = vr.a(-2, 1 + rl.field_r);
          if (param1 != 9863) {
            field_h = -66;
            var8 = var7 - var6;
            ga.field_R = (float)var6 + (float)var8 * var5;
            mf.field_Db = dg.field_c + ": " + (int)ga.field_R + "%";
            nm.field_g.b((byte) 63);
            return;
          } else {
            var8 = var7 - var6;
            ga.field_R = (float)var6 + (float)var8 * var5;
            mf.field_Db = dg.field_c + ": " + (int)ga.field_R + "%";
            nm.field_g.b((byte) 63);
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_i = null;
        int var1 = 43 / ((32 - param0) / 58);
    }

    jm(long param0, int param1, byte[] param2) {
        ((jm) this).field_f = param0;
        ((jm) this).field_j = param1;
        ((jm) this).field_k = param2;
    }

    static {
    }
}
