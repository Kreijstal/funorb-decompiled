/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq {
    static String field_b;
    private int field_c;
    private byte[] field_h;
    private long[] field_k;
    private long[] field_l;
    private long[] field_e;
    private long[] field_f;
    private byte[] field_d;
    private int field_j;
    private long[] field_a;
    static String field_i;
    static wh field_g;
    static mk field_m;

    final static void a(int param0) {
        cr.f((byte) -45);
        if (param0 != 7) {
          field_g = null;
          lq.d(125);
          no.field_p = null;
          rd.a(param0 + -8);
          return;
        } else {
          lq.d(125);
          no.field_p = null;
          rd.a(param0 + -8);
          return;
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (32 <= var2) {
            if (param0 == 99) {
              ((eq) this).field_j = 0;
              ((eq) this).field_h[0] = (byte) 0;
              ((eq) this).field_c = 0;
              var2 = 0;
              L1: while (true) {
                if (8 > var2) {
                  ((eq) this).field_a[var2] = 0L;
                  var2++;
                  if (var3 == 0) {
                    continue L1;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              ((eq) this).a((byte[]) null, -112, 22L);
              ((eq) this).field_j = 0;
              ((eq) this).field_h[0] = (byte) 0;
              ((eq) this).field_c = 0;
              var2 = 0;
              L2: while (true) {
                if (8 > var2) {
                  ((eq) this).field_a[var2] = 0L;
                  var2++;
                  if (var3 == 0) {
                    continue L2;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            ((eq) this).field_d[var2] = (byte) 0;
            var2++;
            if (var3 != 0) {
              var2 = 0;
              L3: while (true) {
                if (8 > var2) {
                  ((eq) this).field_a[var2] = 0L;
                  var2++;
                  if (var3 == 0) {
                    continue L3;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              if (var3 == 0) {
                continue L0;
              } else {
                if (param0 == 99) {
                  ((eq) this).field_j = 0;
                  ((eq) this).field_h[0] = (byte) 0;
                  ((eq) this).field_c = 0;
                  var2 = 0;
                  L4: while (true) {
                    if (8 > var2) {
                      ((eq) this).field_a[var2] = 0L;
                      var2++;
                      if (var3 == 0) {
                        continue L4;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  ((eq) this).a((byte[]) null, -112, 22L);
                  ((eq) this).field_j = 0;
                  ((eq) this).field_h[0] = (byte) 0;
                  ((eq) this).field_c = 0;
                  var2 = 0;
                  L5: while (true) {
                    if (8 > var2) {
                      ((eq) this).field_a[var2] = 0L;
                      var2++;
                      if (var3 == 0) {
                        continue L5;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static String c(byte param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_8_0 = null;
        String stackIn_9_0 = null;
        String stackOut_7_0 = null;
        L0: {
          var5 = BrickABrac.field_J ? 1 : 0;
          if (param0 < -58) {
            break L0;
          } else {
            String discarded$2 = eq.c((byte) -29);
            break L0;
          }
        }
        var1 = "(" + r.field_z + " " + we.field_a + " " + mh.field_gb + ") " + si.field_a;
        if (ga.field_j > 0) {
          var1 = var1 + ":";
          var2 = 0;
          L1: while (true) {
            if (var2 < ga.field_j) {
              stackOut_7_0 = var1 + 32;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (var5 == 0) {
                L2: {
                  L3: {
                    var1 = stackIn_9_0;
                    var3 = 255 & jl.field_e.field_k[var2];
                    var4 = var3 >> 4;
                    var3 = var3 & 15;
                    if (var4 >= 10) {
                      break L3;
                    } else {
                      var4 += 48;
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var4 += 55;
                  break L2;
                }
                L4: {
                  L5: {
                    if (10 > var3) {
                      break L5;
                    } else {
                      var3 += 55;
                      if (var5 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var3 += 48;
                  break L4;
                }
                var1 = var1 + (char)var4;
                var1 = var1 + (char)var3;
                var2++;
                continue L1;
              } else {
                return stackIn_8_0;
              }
            } else {
              return var1;
            }
          }
        } else {
          return var1;
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_51_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_176_0 = 0;
        int stackIn_191_0 = 0;
        int stackIn_193_0 = 0;
        int stackIn_204_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_216_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_230_0 = 0;
        int stackIn_232_0 = 0;
        int stackIn_247_0 = 0;
        int stackIn_249_0 = 0;
        int stackIn_260_0 = 0;
        int stackIn_268_0 = 0;
        int stackIn_272_0 = 0;
        int stackIn_274_0 = 0;
        int stackOut_217_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_213_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_176_0 = 0;
        int stackOut_192_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_205_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_273_0 = 0;
        int stackOut_274_0 = 0;
        int stackOut_269_0 = 0;
        int stackOut_231_0 = 0;
        int stackOut_232_0 = 0;
        int stackOut_248_0 = 0;
        int stackOut_249_0 = 0;
        int stackOut_261_0 = 0;
        int stackOut_50_0 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        var3 = 0;
        if (param0 > 19) {
          L0: while (true) {
            L1: {
              if (var2 >= 8) {
                var2 = 0;
                break L1;
              } else {
                ((eq) this).field_e[var2] = qf.a(qf.a(qf.a(qf.a(qf.a(ch.a(255L, (long)((eq) this).field_h[var3 + 3]) << 32, qf.a(ch.a((long)((eq) this).field_h[2 + var3], 255L) << 40, qf.a(ch.a((long)((eq) this).field_h[1 + var3], 255L) << 48, (long)((eq) this).field_h[var3] << 56))), ch.a((long)((eq) this).field_h[var3 - -4], 255L) << 24), ch.a((long)((eq) this).field_h[var3 - -5], 255L) << 16), ch.a(65280L, (long)((eq) this).field_h[6 + var3] << 8)), ch.a((long)((eq) this).field_h[var3 + 7], 255L));
                var2++;
                var3 += 8;
                if (var6 != 0) {
                  break L1;
                } else {
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    var2 = 0;
                    L2: while (true) {
                      L3: {
                        if (var2 >= 8) {
                          var2 = 1;
                          break L3;
                        } else {
                          ((eq) this).field_f[var2] = ((eq) this).field_a[var2];
                          ((eq) this).field_k[var2] = qf.a(((eq) this).field_e[var2], ((eq) this).field_a[var2]);
                          var2++;
                          if (var6 != 0) {
                            break L3;
                          } else {
                            continue L2;
                          }
                        }
                      }
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (var2 > 10) {
                              break L6;
                            } else {
                              stackOut_217_0 = 0;
                              stackIn_106_0 = stackOut_217_0;
                              stackIn_218_0 = stackOut_217_0;
                              if (var6 != 0) {
                                break L5;
                              } else {
                                stackOut_218_0 = stackIn_218_0;
                                stackIn_216_0 = stackOut_218_0;
                                var3 = stackIn_216_0;
                                L7: while (true) {
                                  L8: {
                                    if (var3 >= 8) {
                                      stackOut_213_0 = 0;
                                      stackIn_212_0 = stackOut_213_0;
                                      break L8;
                                    } else {
                                      ((eq) this).field_l[var3] = 0L;
                                      var4 = 0;
                                      stackOut_175_0 = 56;
                                      stackIn_212_0 = stackOut_175_0;
                                      stackIn_176_0 = stackOut_175_0;
                                      if (var6 != 0) {
                                        break L8;
                                      } else {
                                        stackOut_176_0 = stackIn_176_0;
                                        stackIn_174_0 = stackOut_176_0;
                                        var5 = stackIn_174_0;
                                        L9: while (true) {
                                          L10: {
                                            L11: {
                                              if (8 <= var4) {
                                                break L11;
                                              } else {
                                                ((eq) this).field_l[var3] = qf.a(((eq) this).field_l[var3], oa.field_Wb[var4][ik.a((int)(((eq) this).field_f[ik.a(var3 - var4, 7)] >>> var5), 255)]);
                                                var4++;
                                                var5 -= 8;
                                                if (var6 != 0) {
                                                  break L10;
                                                } else {
                                                  if (var6 == 0) {
                                                    continue L9;
                                                  } else {
                                                    break L11;
                                                  }
                                                }
                                              }
                                            }
                                            var3++;
                                            break L10;
                                          }
                                          continue L7;
                                        }
                                      }
                                    }
                                  }
                                  var3 = stackIn_212_0;
                                  L12: while (true) {
                                    L13: {
                                      if (8 <= var3) {
                                        ((eq) this).field_f[0] = qf.a(((eq) this).field_f[0], oa.field_Xb[var2]);
                                        break L13;
                                      } else {
                                        ((eq) this).field_f[var3] = ((eq) this).field_l[var3];
                                        var3++;
                                        if (var6 != 0) {
                                          break L13;
                                        } else {
                                          if (var6 == 0) {
                                            continue L12;
                                          } else {
                                            ((eq) this).field_f[0] = qf.a(((eq) this).field_f[0], oa.field_Xb[var2]);
                                            break L13;
                                          }
                                        }
                                      }
                                    }
                                    var3 = 0;
                                    L14: while (true) {
                                      L15: {
                                        L16: {
                                          if (var3 >= 8) {
                                            break L16;
                                          } else {
                                            ((eq) this).field_l[var3] = ((eq) this).field_f[var3];
                                            var4 = 0;
                                            stackOut_192_0 = 56;
                                            stackIn_204_0 = stackOut_192_0;
                                            stackIn_193_0 = stackOut_192_0;
                                            if (var6 != 0) {
                                              break L15;
                                            } else {
                                              stackOut_193_0 = stackIn_193_0;
                                              stackIn_191_0 = stackOut_193_0;
                                              var5 = stackIn_191_0;
                                              L17: while (true) {
                                                L18: {
                                                  if (var4 >= 8) {
                                                    var3++;
                                                    break L18;
                                                  } else {
                                                    ((eq) this).field_l[var3] = qf.a(((eq) this).field_l[var3], oa.field_Wb[var4][ik.a(255, (int)(((eq) this).field_k[ik.a(var3 - var4, 7)] >>> var5))]);
                                                    var4++;
                                                    var5 -= 8;
                                                    if (var6 != 0) {
                                                      break L18;
                                                    } else {
                                                      continue L17;
                                                    }
                                                  }
                                                }
                                                if (var6 == 0) {
                                                  continue L14;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        stackOut_205_0 = 0;
                                        stackIn_204_0 = stackOut_205_0;
                                        break L15;
                                      }
                                      var3 = stackIn_204_0;
                                      L19: while (true) {
                                        L20: {
                                          L21: {
                                            if (var3 >= 8) {
                                              break L21;
                                            } else {
                                              ((eq) this).field_k[var3] = ((eq) this).field_l[var3];
                                              var3++;
                                              if (var6 != 0) {
                                                break L20;
                                              } else {
                                                if (var6 == 0) {
                                                  continue L19;
                                                } else {
                                                  break L21;
                                                }
                                              }
                                            }
                                          }
                                          var2++;
                                          break L20;
                                        }
                                        if (var6 == 0) {
                                          continue L4;
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
                          stackOut_105_0 = 0;
                          stackIn_106_0 = stackOut_105_0;
                          break L5;
                        }
                        var2 = stackIn_106_0;
                        L22: while (true) {
                          if (var2 < 8) {
                            ((eq) this).field_a[var2] = qf.a(((eq) this).field_a[var2], qf.a(((eq) this).field_k[var2], ((eq) this).field_e[var2]));
                            var2++;
                            if (var6 == 0) {
                              continue L22;
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            L23: while (true) {
              L24: {
                if (var2 >= 8) {
                  var2 = 1;
                  break L24;
                } else {
                  ((eq) this).field_f[var2] = ((eq) this).field_a[var2];
                  ((eq) this).field_k[var2] = qf.a(((eq) this).field_e[var2], ((eq) this).field_a[var2]);
                  var2++;
                  if (var6 != 0) {
                    break L24;
                  } else {
                    continue L23;
                  }
                }
              }
              L25: while (true) {
                L26: {
                  L27: {
                    if (var2 > 10) {
                      break L27;
                    } else {
                      stackOut_120_0 = 0;
                      stackIn_158_0 = stackOut_120_0;
                      stackIn_121_0 = stackOut_120_0;
                      if (var6 != 0) {
                        break L26;
                      } else {
                        var3 = stackIn_121_0;
                        L28: while (true) {
                          L29: {
                            if (var3 >= 8) {
                              stackOut_131_0 = 0;
                              stackIn_132_0 = stackOut_131_0;
                              break L29;
                            } else {
                              ((eq) this).field_l[var3] = 0L;
                              var4 = 0;
                              stackOut_123_0 = 56;
                              stackIn_132_0 = stackOut_123_0;
                              stackIn_124_0 = stackOut_123_0;
                              if (var6 != 0) {
                                break L29;
                              } else {
                                var5 = stackIn_124_0;
                                L30: while (true) {
                                  L31: {
                                    if (8 <= var4) {
                                      var3++;
                                      break L31;
                                    } else {
                                      ((eq) this).field_l[var3] = qf.a(((eq) this).field_l[var3], oa.field_Wb[var4][ik.a((int)(((eq) this).field_f[ik.a(var3 - var4, 7)] >>> var5), 255)]);
                                      var4++;
                                      var5 -= 8;
                                      if (var6 != 0) {
                                        break L31;
                                      } else {
                                        continue L30;
                                      }
                                    }
                                  }
                                  continue L28;
                                }
                              }
                            }
                          }
                          var3 = stackIn_132_0;
                          L32: while (true) {
                            L33: {
                              if (8 <= var3) {
                                ((eq) this).field_f[0] = qf.a(((eq) this).field_f[0], oa.field_Xb[var2]);
                                break L33;
                              } else {
                                ((eq) this).field_f[var3] = ((eq) this).field_l[var3];
                                var3++;
                                if (var6 != 0) {
                                  break L33;
                                } else {
                                  continue L32;
                                }
                              }
                            }
                            var3 = 0;
                            L34: while (true) {
                              L35: {
                                L36: {
                                  if (var3 >= 8) {
                                    break L36;
                                  } else {
                                    ((eq) this).field_l[var3] = ((eq) this).field_f[var3];
                                    var4 = 0;
                                    stackOut_141_0 = 56;
                                    stackIn_150_0 = stackOut_141_0;
                                    stackIn_142_0 = stackOut_141_0;
                                    if (var6 != 0) {
                                      break L35;
                                    } else {
                                      var5 = stackIn_142_0;
                                      L37: while (true) {
                                        L38: {
                                          if (var4 >= 8) {
                                            var3++;
                                            break L38;
                                          } else {
                                            ((eq) this).field_l[var3] = qf.a(((eq) this).field_l[var3], oa.field_Wb[var4][ik.a(255, (int)(((eq) this).field_k[ik.a(var3 - var4, 7)] >>> var5))]);
                                            var4++;
                                            var5 -= 8;
                                            if (var6 != 0) {
                                              break L38;
                                            } else {
                                              continue L37;
                                            }
                                          }
                                        }
                                        if (var6 == 0) {
                                          continue L34;
                                        } else {
                                          break L36;
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_149_0 = 0;
                                stackIn_150_0 = stackOut_149_0;
                                break L35;
                              }
                              var3 = stackIn_150_0;
                              L39: while (true) {
                                L40: {
                                  L41: {
                                    if (var3 >= 8) {
                                      break L41;
                                    } else {
                                      ((eq) this).field_k[var3] = ((eq) this).field_l[var3];
                                      var3++;
                                      if (var6 != 0) {
                                        break L40;
                                      } else {
                                        if (var6 == 0) {
                                          continue L39;
                                        } else {
                                          break L41;
                                        }
                                      }
                                    }
                                  }
                                  var2++;
                                  break L40;
                                }
                                if (var6 == 0) {
                                  continue L25;
                                } else {
                                  break L27;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_157_0 = 0;
                  stackIn_158_0 = stackOut_157_0;
                  break L26;
                }
                var2 = stackIn_158_0;
                L42: while (true) {
                  if (var2 < 8) {
                    ((eq) this).field_a[var2] = qf.a(((eq) this).field_a[var2], qf.a(((eq) this).field_k[var2], ((eq) this).field_e[var2]));
                    var2++;
                    if (var6 == 0) {
                      continue L42;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } else {
          ((eq) this).field_l = null;
          L43: while (true) {
            L44: {
              L45: {
                if (var2 >= 8) {
                  break L45;
                } else {
                  ((eq) this).field_e[var2] = qf.a(qf.a(qf.a(qf.a(qf.a(ch.a(255L, (long)((eq) this).field_h[var3 + 3]) << 32, qf.a(ch.a((long)((eq) this).field_h[2 + var3], 255L) << 40, qf.a(ch.a((long)((eq) this).field_h[1 + var3], 255L) << 48, (long)((eq) this).field_h[var3] << 56))), ch.a((long)((eq) this).field_h[var3 - -4], 255L) << 24), ch.a((long)((eq) this).field_h[var3 - -5], 255L) << 16), ch.a(65280L, (long)((eq) this).field_h[6 + var3] << 8)), ch.a((long)((eq) this).field_h[var3 + 7], 255L));
                  var2++;
                  var3 += 8;
                  if (var6 != 0) {
                    break L44;
                  } else {
                    if (var6 == 0) {
                      continue L43;
                    } else {
                      break L45;
                    }
                  }
                }
              }
              var2 = 0;
              break L44;
            }
            L46: while (true) {
              L47: {
                if (var2 >= 8) {
                  var2 = 1;
                  break L47;
                } else {
                  ((eq) this).field_f[var2] = ((eq) this).field_a[var2];
                  ((eq) this).field_k[var2] = qf.a(((eq) this).field_e[var2], ((eq) this).field_a[var2]);
                  var2++;
                  if (var6 != 0) {
                    break L47;
                  } else {
                    continue L46;
                  }
                }
              }
              L48: while (true) {
                L49: {
                  L50: {
                    if (var2 > 10) {
                      break L50;
                    } else {
                      stackOut_273_0 = 0;
                      stackIn_51_0 = stackOut_273_0;
                      stackIn_274_0 = stackOut_273_0;
                      if (var6 != 0) {
                        break L49;
                      } else {
                        stackOut_274_0 = stackIn_274_0;
                        stackIn_272_0 = stackOut_274_0;
                        var3 = stackIn_272_0;
                        L51: while (true) {
                          L52: {
                            if (var3 >= 8) {
                              stackOut_269_0 = 0;
                              stackIn_268_0 = stackOut_269_0;
                              break L52;
                            } else {
                              ((eq) this).field_l[var3] = 0L;
                              var4 = 0;
                              stackOut_231_0 = 56;
                              stackIn_268_0 = stackOut_231_0;
                              stackIn_232_0 = stackOut_231_0;
                              if (var6 != 0) {
                                break L52;
                              } else {
                                stackOut_232_0 = stackIn_232_0;
                                stackIn_230_0 = stackOut_232_0;
                                var5 = stackIn_230_0;
                                L53: while (true) {
                                  L54: {
                                    L55: {
                                      if (8 <= var4) {
                                        break L55;
                                      } else {
                                        ((eq) this).field_l[var3] = qf.a(((eq) this).field_l[var3], oa.field_Wb[var4][ik.a((int)(((eq) this).field_f[ik.a(var3 - var4, 7)] >>> var5), 255)]);
                                        var4++;
                                        var5 -= 8;
                                        if (var6 != 0) {
                                          break L54;
                                        } else {
                                          if (var6 == 0) {
                                            continue L53;
                                          } else {
                                            break L55;
                                          }
                                        }
                                      }
                                    }
                                    var3++;
                                    break L54;
                                  }
                                  continue L51;
                                }
                              }
                            }
                          }
                          var3 = stackIn_268_0;
                          L56: while (true) {
                            L57: {
                              if (8 <= var3) {
                                ((eq) this).field_f[0] = qf.a(((eq) this).field_f[0], oa.field_Xb[var2]);
                                break L57;
                              } else {
                                ((eq) this).field_f[var3] = ((eq) this).field_l[var3];
                                var3++;
                                if (var6 != 0) {
                                  break L57;
                                } else {
                                  if (var6 == 0) {
                                    continue L56;
                                  } else {
                                    ((eq) this).field_f[0] = qf.a(((eq) this).field_f[0], oa.field_Xb[var2]);
                                    break L57;
                                  }
                                }
                              }
                            }
                            var3 = 0;
                            L58: while (true) {
                              L59: {
                                L60: {
                                  if (var3 >= 8) {
                                    break L60;
                                  } else {
                                    ((eq) this).field_l[var3] = ((eq) this).field_f[var3];
                                    var4 = 0;
                                    stackOut_248_0 = 56;
                                    stackIn_260_0 = stackOut_248_0;
                                    stackIn_249_0 = stackOut_248_0;
                                    if (var6 != 0) {
                                      break L59;
                                    } else {
                                      stackOut_249_0 = stackIn_249_0;
                                      stackIn_247_0 = stackOut_249_0;
                                      var5 = stackIn_247_0;
                                      L61: while (true) {
                                        L62: {
                                          if (var4 >= 8) {
                                            var3++;
                                            break L62;
                                          } else {
                                            ((eq) this).field_l[var3] = qf.a(((eq) this).field_l[var3], oa.field_Wb[var4][ik.a(255, (int)(((eq) this).field_k[ik.a(var3 - var4, 7)] >>> var5))]);
                                            var4++;
                                            var5 -= 8;
                                            if (var6 != 0) {
                                              break L62;
                                            } else {
                                              continue L61;
                                            }
                                          }
                                        }
                                        if (var6 == 0) {
                                          continue L58;
                                        } else {
                                          break L60;
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_261_0 = 0;
                                stackIn_260_0 = stackOut_261_0;
                                break L59;
                              }
                              var3 = stackIn_260_0;
                              L63: while (true) {
                                L64: {
                                  L65: {
                                    if (var3 >= 8) {
                                      break L65;
                                    } else {
                                      ((eq) this).field_k[var3] = ((eq) this).field_l[var3];
                                      var3++;
                                      if (var6 != 0) {
                                        break L64;
                                      } else {
                                        if (var6 == 0) {
                                          continue L63;
                                        } else {
                                          break L65;
                                        }
                                      }
                                    }
                                  }
                                  var2++;
                                  break L64;
                                }
                                if (var6 == 0) {
                                  continue L48;
                                } else {
                                  break L50;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_50_0 = 0;
                  stackIn_51_0 = stackOut_50_0;
                  break L49;
                }
                var2 = stackIn_51_0;
                L66: while (true) {
                  if (var2 < 8) {
                    ((eq) this).field_a[var2] = qf.a(((eq) this).field_a[var2], qf.a(((eq) this).field_k[var2], ((eq) this).field_e[var2]));
                    var2++;
                    if (var6 == 0) {
                      continue L66;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final void a(byte[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        long var7 = 0L;
        int var9 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              ((eq) this).field_h[((eq) this).field_c] = (byte)ud.d((int) ((eq) this).field_h[((eq) this).field_c], 128 >>> ik.a(7, ((eq) this).field_j));
              var4_int = -48 % ((-28 - param1) / 38);
              ((eq) this).field_c = ((eq) this).field_c + 1;
              if (((eq) this).field_c <= 32) {
                break L1;
              } else {
                L2: while (true) {
                  if (((eq) this).field_c >= 64) {
                    this.a((byte) 109);
                    ((eq) this).field_c = 0;
                    break L1;
                  } else {
                    int fieldTemp$2 = ((eq) this).field_c;
                    ((eq) this).field_c = ((eq) this).field_c + 1;
                    ((eq) this).field_h[fieldTemp$2] = (byte) 0;
                    if (var9 != 0) {
                      ((eq) this).field_c = 0;
                      break L1;
                    } else {
                      if (var9 == 0) {
                        continue L2;
                      } else {
                        this.a((byte) 109);
                        ((eq) this).field_c = 0;
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            L3: while (true) {
              L4: {
                L5: {
                  if (((eq) this).field_c >= 32) {
                    break L5;
                  } else {
                    int fieldTemp$3 = ((eq) this).field_c;
                    ((eq) this).field_c = ((eq) this).field_c + 1;
                    ((eq) this).field_h[fieldTemp$3] = (byte) 0;
                    if (var9 != 0) {
                      break L4;
                    } else {
                      if (var9 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                pm.a(((eq) this).field_d, 0, ((eq) this).field_h, 32, 32);
                this.a((byte) 47);
                break L4;
              }
              var5 = 0;
              var6 = param2;
              L6: while (true) {
                if (var5 >= 8) {
                  break L0;
                } else {
                  var7 = ((eq) this).field_a[var5];
                  param0[var6] = (byte)(int)(var7 >>> 56);
                  param0[var6 + 1] = (byte)(int)(var7 >>> 48);
                  param0[2 + var6] = (byte)(int)(var7 >>> 40);
                  param0[3 + var6] = (byte)(int)(var7 >>> 32);
                  param0[var6 + 4] = (byte)(int)(var7 >>> 24);
                  param0[5 + var6] = (byte)(int)(var7 >>> 16);
                  param0[var6 - -6] = (byte)(int)(var7 >>> 8);
                  param0[7 + var6] = (byte)(int)var7;
                  var5++;
                  var6 += 8;
                  if (var9 == 0) {
                    continue L6;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("eq.E(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(byte[] param0, int param1, long param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 8 - ((int)param2 & 7) & 7;
              var7 = ((eq) this).field_j & 7;
              if (param1 == 540) {
                break L1;
              } else {
                this.a((byte) -98);
                break L1;
              }
            }
            var9 = param2;
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        if (0 > var11) {
                          break L7;
                        } else {
                          var12 = var12 + ((255 & (int)var9) + (255 & ((eq) this).field_d[var11]));
                          ((eq) this).field_d[var11] = (byte)var12;
                          var12 = var12 >>> 8;
                          var9 = var9 >>> 8;
                          var11--;
                          if (var13 != 0) {
                            break L6;
                          } else {
                            if (var13 == 0) {
                              continue L2;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      L8: while (true) {
                        if (8L >= param2) {
                          break L6;
                        } else {
                          var8 = param0[var5_int] << var6 & 255 | (param0[var5_int - -1] & 255) >>> -var6 + 8;
                          var15 = ~var8;
                          var14 = -1;
                          if (var13 != 0) {
                            if (var14 != var15) {
                              break L4;
                            } else {
                              break L5;
                            }
                          } else {
                            L9: {
                              if (var14 < var15) {
                                break L9;
                              } else {
                                if (256 > var8) {
                                  L10: {
                                    ((eq) this).field_h[((eq) this).field_c] = (byte)ud.d((int) ((eq) this).field_h[((eq) this).field_c], var8 >>> var7);
                                    ((eq) this).field_c = ((eq) this).field_c + 1;
                                    ((eq) this).field_j = ((eq) this).field_j + (-var7 + 8);
                                    if (((eq) this).field_j == 512) {
                                      this.a((byte) 38);
                                      ((eq) this).field_j = 0;
                                      ((eq) this).field_c = 0;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  ((eq) this).field_h[((eq) this).field_c] = (byte)ik.a(255, var8 << 8 + -var7);
                                  ((eq) this).field_j = ((eq) this).field_j + var7;
                                  var5_int++;
                                  param2 = param2 - 8L;
                                  if (var13 == 0) {
                                    continue L8;
                                  } else {
                                    break L6;
                                  }
                                } else {
                                  break L9;
                                }
                              }
                            }
                            throw new RuntimeException("LOGIC ERROR");
                          }
                        }
                      }
                    }
                    L11: {
                      L12: {
                        if (param2 <= 0L) {
                          break L12;
                        } else {
                          var8 = 255 & param0[var5_int] << var6;
                          ((eq) this).field_h[((eq) this).field_c] = (byte)ud.d((int) ((eq) this).field_h[((eq) this).field_c], var8 >>> var7);
                          if (var13 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      var8 = 0;
                      break L11;
                    }
                    L13: {
                      if ((long)var7 - -param2 >= 8L) {
                        break L13;
                      } else {
                        ((eq) this).field_j = (int)((long)((eq) this).field_j + param2);
                        if (var13 == 0) {
                          break L3;
                        } else {
                          break L13;
                        }
                      }
                    }
                    param2 = param2 - (long)(8 - var7);
                    ((eq) this).field_c = ((eq) this).field_c + 1;
                    ((eq) this).field_j = ((eq) this).field_j + (8 + -var7);
                    if (((eq) this).field_j != 512) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                  this.a((byte) 41);
                  ((eq) this).field_j = 0;
                  ((eq) this).field_c = 0;
                  break L4;
                }
                ((eq) this).field_h[((eq) this).field_c] = (byte)ik.a(255, var8 << 8 + -var7);
                ((eq) this).field_j = ((eq) this).field_j + (int)param2;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var5;
            stackOut_31_1 = new StringBuilder().append("eq.D(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L14;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L14;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void b(int param0) {
        field_m = null;
        field_b = null;
        field_g = null;
        field_i = null;
        if (param0 == -1) {
            return;
        }
        field_m = null;
    }

    eq() {
        ((eq) this).field_e = new long[8];
        ((eq) this).field_h = new byte[64];
        ((eq) this).field_d = new byte[32];
        ((eq) this).field_f = new long[8];
        ((eq) this).field_l = new long[8];
        ((eq) this).field_k = new long[8];
        ((eq) this).field_c = 0;
        ((eq) this).field_j = 0;
        ((eq) this).field_a = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "The game options are not all set.";
        field_i = "This password contains repeated characters, and would be easy to guess";
    }
}
