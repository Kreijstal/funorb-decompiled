/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vb extends bf {
    static String field_i;

    final static void f(int param0) {
        double var1 = 0.0;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_154_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_196_0 = 0;
        int stackIn_199_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_195_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_197_0 = 0;
        int stackOut_153_0 = 0;
        int stackOut_152_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_111_0 = 0;
        L0: {
          var4 = MonkeyPuzzle2.field_F ? 1 : 0;
          si.field_r = si.field_r + 1;
          if ((3 & si.field_r) != 0) {
            break L0;
          } else {
            bc.field_a = bc.field_a + 1;
            if (5 != bc.field_a) {
              ob.field_r = ob.field_r + 1;
              if ((ob.field_r ^ -1) == -6) {
                ob.field_r = 0;
                break L0;
              } else {
                L1: {
                  dd.field_e = dd.field_e + 6;
                  hl.field_a = hl.field_a + 1;
                  ne.field_b = ne.field_b + 6;
                  if (60 >= hl.field_a) {
                    break L1;
                  } else {
                    hl.field_a = 60;
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    if (ah.field_d > -1301) {
                      break L3;
                    } else {
                      if (-1801 >= ah.field_d) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (dk.field_j != 0) {
                    break L2;
                  } else {
                    if (Math.random() <= 0.99) {
                      break L2;
                    } else {
                      L4: {
                        if (480 >= ne.field_b) {
                          stackOut_62_0 = 0;
                          stackIn_63_0 = stackOut_62_0;
                          break L4;
                        } else {
                          stackOut_61_0 = 1;
                          stackIn_63_0 = stackOut_61_0;
                          break L4;
                        }
                      }
                      L5: {
                        var1_int = stackIn_63_0;
                        if ((dd.field_e ^ -1) >= -481) {
                          stackOut_65_0 = 0;
                          stackIn_66_0 = stackOut_65_0;
                          break L5;
                        } else {
                          stackOut_64_0 = 1;
                          stackIn_66_0 = stackOut_64_0;
                          break L5;
                        }
                      }
                      L6: {
                        var2 = stackIn_66_0;
                        if (var1_int == 0) {
                          break L6;
                        } else {
                          if (var2 == 0) {
                            break L6;
                          } else {
                            if (Math.random() >= 0.5) {
                              var1_int = 0;
                              break L6;
                            } else {
                              var2 = 0;
                              break L6;
                            }
                          }
                        }
                      }
                      L7: {
                        if (var2 == 0) {
                          break L7;
                        } else {
                          dd.field_e = -df.field_q[0].field_n;
                          break L7;
                        }
                      }
                      if (var1_int != 0) {
                        ne.field_b = -df.field_q[0].field_n;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L8: {
                  ah.field_d = ah.field_d + 2;
                  if ((ah.field_d ^ -1) < -2001) {
                    ah.field_d = 0;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (param0 >= 15) {
                    break L9;
                  } else {
                    field_i = null;
                    break L9;
                  }
                }
                L10: {
                  var1 = Math.random();
                  if (var1 > 0.95) {
                    if (var1 > 0.975) {
                      cj.a((byte) 127, ke.field_h[16]);
                      break L10;
                    } else {
                      cj.a((byte) -23, ke.field_h[17]);
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (0 != (ah.field_d & 3)) {
                    break L11;
                  } else {
                    L12: {
                      L13: {
                        if (ah.field_d >= -1301) {
                          break L13;
                        } else {
                          if (ah.field_d > -1801) {
                            L14: {
                              if (-1306 <= ah.field_d) {
                                break L14;
                              } else {
                                cj.a((byte) 124, ke.field_h[15]);
                                break L14;
                              }
                            }
                            if (-201 >= (dk.field_j ^ -1)) {
                              break L12;
                            } else {
                              ve.field_x[dk.field_j][0] = pf.a((byte) 104, 640);
                              ve.field_x[dk.field_j][1] = pf.a((byte) -100, 480);
                              dk.field_j = dk.field_j + 1;
                              break L12;
                            }
                          } else {
                            break L13;
                          }
                        }
                      }
                      if (-1 >= dk.field_j) {
                        break L12;
                      } else {
                        dk.field_j = dk.field_j - 1;
                        break L12;
                      }
                    }
                    var3 = 0;
                    L15: while (true) {
                      if (var3 >= dk.field_j) {
                        break L11;
                      } else {
                        ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                        ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                        var3++;
                        continue L15;
                      }
                    }
                  }
                }
                return;
              }
            } else {
              L16: {
                bc.field_a = 0;
                ob.field_r = ob.field_r + 1;
                if ((ob.field_r ^ -1) == -6) {
                  ob.field_r = 0;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                dd.field_e = dd.field_e + 6;
                hl.field_a = hl.field_a + 1;
                ne.field_b = ne.field_b + 6;
                if (60 >= hl.field_a) {
                  break L17;
                } else {
                  hl.field_a = 60;
                  break L17;
                }
              }
              L18: {
                L19: {
                  if (ah.field_d > -1301) {
                    break L19;
                  } else {
                    if (-1801 >= ah.field_d) {
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                if (dk.field_j != 0) {
                  break L18;
                } else {
                  if (Math.random() <= 0.99) {
                    break L18;
                  } else {
                    L20: {
                      if (480 >= ne.field_b) {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        break L20;
                      } else {
                        stackOut_13_0 = 1;
                        stackIn_15_0 = stackOut_13_0;
                        break L20;
                      }
                    }
                    L21: {
                      var1_int = stackIn_15_0;
                      if ((dd.field_e ^ -1) >= -481) {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        break L21;
                      } else {
                        stackOut_16_0 = 1;
                        stackIn_18_0 = stackOut_16_0;
                        break L21;
                      }
                    }
                    L22: {
                      var2 = stackIn_18_0;
                      if (var1_int == 0) {
                        break L22;
                      } else {
                        if (var2 == 0) {
                          break L22;
                        } else {
                          if (Math.random() >= 0.5) {
                            var1_int = 0;
                            break L22;
                          } else {
                            var2 = 0;
                            break L22;
                          }
                        }
                      }
                    }
                    L23: {
                      if (var2 == 0) {
                        break L23;
                      } else {
                        dd.field_e = -df.field_q[0].field_n;
                        break L23;
                      }
                    }
                    if (var1_int != 0) {
                      ne.field_b = -df.field_q[0].field_n;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                }
              }
              L24: {
                ah.field_d = ah.field_d + 2;
                if ((ah.field_d ^ -1) < -2001) {
                  ah.field_d = 0;
                  break L24;
                } else {
                  break L24;
                }
              }
              L25: {
                if (param0 >= 15) {
                  break L25;
                } else {
                  field_i = null;
                  break L25;
                }
              }
              L26: {
                var1 = Math.random();
                if (var1 > 0.95) {
                  if (var1 > 0.975) {
                    cj.a((byte) 127, ke.field_h[16]);
                    break L26;
                  } else {
                    cj.a((byte) -23, ke.field_h[17]);
                    break L26;
                  }
                } else {
                  break L26;
                }
              }
              L27: {
                if (0 != (ah.field_d & 3)) {
                  break L27;
                } else {
                  L28: {
                    L29: {
                      if (ah.field_d >= -1301) {
                        break L29;
                      } else {
                        if (ah.field_d > -1801) {
                          L30: {
                            if (-1306 <= ah.field_d) {
                              break L30;
                            } else {
                              cj.a((byte) 124, ke.field_h[15]);
                              break L30;
                            }
                          }
                          if (-201 >= (dk.field_j ^ -1)) {
                            break L28;
                          } else {
                            ve.field_x[dk.field_j][0] = pf.a((byte) 104, 640);
                            ve.field_x[dk.field_j][1] = pf.a((byte) -100, 480);
                            dk.field_j = dk.field_j + 1;
                            break L28;
                          }
                        } else {
                          break L29;
                        }
                      }
                    }
                    if (-1 >= dk.field_j) {
                      break L28;
                    } else {
                      dk.field_j = dk.field_j - 1;
                      break L28;
                    }
                  }
                  var3 = 0;
                  L31: while (true) {
                    if (var3 >= dk.field_j) {
                      break L27;
                    } else {
                      ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                      ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                      var3++;
                      continue L31;
                    }
                  }
                }
              }
              return;
            }
          }
        }
        dd.field_e = dd.field_e + 6;
        hl.field_a = hl.field_a + 1;
        ne.field_b = ne.field_b + 6;
        if (60 >= hl.field_a) {
          L32: {
            if (ah.field_d > -1301) {
              if (dk.field_j != 0) {
                break L32;
              } else {
                if (Math.random() <= 0.99) {
                  break L32;
                } else {
                  L33: {
                    if (480 >= ne.field_b) {
                      stackOut_195_0 = 0;
                      stackIn_196_0 = stackOut_195_0;
                      break L33;
                    } else {
                      stackOut_194_0 = 1;
                      stackIn_196_0 = stackOut_194_0;
                      break L33;
                    }
                  }
                  L34: {
                    var1_int = stackIn_196_0;
                    if ((dd.field_e ^ -1) >= -481) {
                      stackOut_198_0 = 0;
                      stackIn_199_0 = stackOut_198_0;
                      break L34;
                    } else {
                      stackOut_197_0 = 1;
                      stackIn_199_0 = stackOut_197_0;
                      break L34;
                    }
                  }
                  L35: {
                    var2 = stackIn_199_0;
                    if (var1_int == 0) {
                      break L35;
                    } else {
                      if (var2 == 0) {
                        break L35;
                      } else {
                        if (Math.random() >= 0.5) {
                          var1_int = 0;
                          break L35;
                        } else {
                          var2 = 0;
                          break L35;
                        }
                      }
                    }
                  }
                  L36: {
                    if (var2 == 0) {
                      break L36;
                    } else {
                      dd.field_e = -df.field_q[0].field_n;
                      break L36;
                    }
                  }
                  if (var1_int != 0) {
                    ne.field_b = -df.field_q[0].field_n;
                    break L32;
                  } else {
                    break L32;
                  }
                }
              }
            } else {
              if (-1801 >= ah.field_d) {
                break L32;
              } else {
                L37: {
                  if (dk.field_j != 0) {
                    break L37;
                  } else {
                    if (Math.random() <= 0.99) {
                      break L37;
                    } else {
                      L38: {
                        if (480 >= ne.field_b) {
                          stackOut_153_0 = 0;
                          stackIn_154_0 = stackOut_153_0;
                          break L38;
                        } else {
                          stackOut_152_0 = 1;
                          stackIn_154_0 = stackOut_152_0;
                          break L38;
                        }
                      }
                      L39: {
                        var1_int = stackIn_154_0;
                        if ((dd.field_e ^ -1) >= -481) {
                          stackOut_156_0 = 0;
                          stackIn_157_0 = stackOut_156_0;
                          break L39;
                        } else {
                          stackOut_155_0 = 1;
                          stackIn_157_0 = stackOut_155_0;
                          break L39;
                        }
                      }
                      L40: {
                        var2 = stackIn_157_0;
                        if (var1_int == 0) {
                          break L40;
                        } else {
                          if (var2 == 0) {
                            break L40;
                          } else {
                            if (Math.random() >= 0.5) {
                              var1_int = 0;
                              break L40;
                            } else {
                              var2 = 0;
                              break L40;
                            }
                          }
                        }
                      }
                      L41: {
                        if (var2 == 0) {
                          break L41;
                        } else {
                          dd.field_e = -df.field_q[0].field_n;
                          break L41;
                        }
                      }
                      if (var1_int != 0) {
                        ne.field_b = -df.field_q[0].field_n;
                        break L37;
                      } else {
                        break L37;
                      }
                    }
                  }
                }
                L42: {
                  ah.field_d = ah.field_d + 2;
                  if ((ah.field_d ^ -1) < -2001) {
                    ah.field_d = 0;
                    break L42;
                  } else {
                    break L42;
                  }
                }
                L43: {
                  if (param0 >= 15) {
                    break L43;
                  } else {
                    field_i = null;
                    break L43;
                  }
                }
                L44: {
                  var1 = Math.random();
                  if (var1 > 0.95) {
                    if (var1 > 0.975) {
                      cj.a((byte) 127, ke.field_h[16]);
                      break L44;
                    } else {
                      cj.a((byte) -23, ke.field_h[17]);
                      break L44;
                    }
                  } else {
                    break L44;
                  }
                }
                L45: {
                  if (0 != (ah.field_d & 3)) {
                    break L45;
                  } else {
                    L46: {
                      L47: {
                        if (ah.field_d >= -1301) {
                          break L47;
                        } else {
                          if (ah.field_d > -1801) {
                            L48: {
                              if (-1306 <= ah.field_d) {
                                break L48;
                              } else {
                                cj.a((byte) 124, ke.field_h[15]);
                                break L48;
                              }
                            }
                            if (-201 >= (dk.field_j ^ -1)) {
                              break L46;
                            } else {
                              ve.field_x[dk.field_j][0] = pf.a((byte) 104, 640);
                              ve.field_x[dk.field_j][1] = pf.a((byte) -100, 480);
                              dk.field_j = dk.field_j + 1;
                              break L46;
                            }
                          } else {
                            break L47;
                          }
                        }
                      }
                      if (-1 >= dk.field_j) {
                        break L46;
                      } else {
                        dk.field_j = dk.field_j - 1;
                        break L46;
                      }
                    }
                    var3 = 0;
                    L49: while (true) {
                      if (var3 >= dk.field_j) {
                        break L45;
                      } else {
                        ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                        ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                        var3++;
                        continue L49;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
          L50: {
            ah.field_d = ah.field_d + 2;
            if ((ah.field_d ^ -1) < -2001) {
              ah.field_d = 0;
              break L50;
            } else {
              break L50;
            }
          }
          if (param0 < 15) {
            field_i = null;
            var1 = Math.random();
            if (var1 > 0.95) {
              if (var1 > 0.975) {
                L51: {
                  cj.a((byte) 127, ke.field_h[16]);
                  if (0 != (ah.field_d & 3)) {
                    break L51;
                  } else {
                    L52: {
                      L53: {
                        if ((ah.field_d ^ -1) >= -1301) {
                          break L53;
                        } else {
                          if (ah.field_d > -1801) {
                            if (-1306 >= ah.field_d) {
                              if (-201 >= (dk.field_j ^ -1)) {
                                break L52;
                              } else {
                                ve.field_x[dk.field_j][0] = pf.a((byte) 104, 640);
                                ve.field_x[dk.field_j][1] = pf.a((byte) -100, 480);
                                dk.field_j = dk.field_j + 1;
                                var3 = 0;
                                L54: while (true) {
                                  if (var3 >= dk.field_j) {
                                    return;
                                  } else {
                                    ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                                    ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                                    var3++;
                                    continue L54;
                                  }
                                }
                              }
                            } else {
                              L55: {
                                cj.a((byte) 124, ke.field_h[15]);
                                if (-201 <= dk.field_j) {
                                  break L55;
                                } else {
                                  ve.field_x[dk.field_j][0] = pf.a((byte) 104, 640);
                                  ve.field_x[dk.field_j][1] = pf.a((byte) -100, 480);
                                  dk.field_j = dk.field_j + 1;
                                  break L55;
                                }
                              }
                              var3 = 0;
                              L56: while (true) {
                                if (var3 >= dk.field_j) {
                                  return;
                                } else {
                                  ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                                  ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                                  var3++;
                                  continue L56;
                                }
                              }
                            }
                          } else {
                            break L53;
                          }
                        }
                      }
                      if (-1 >= dk.field_j) {
                        break L52;
                      } else {
                        dk.field_j = dk.field_j - 1;
                        var3 = 0;
                        L57: while (true) {
                          if (var3 >= dk.field_j) {
                            return;
                          } else {
                            ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                            ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                            var3++;
                            continue L57;
                          }
                        }
                      }
                    }
                    var3 = 0;
                    L58: while (true) {
                      if (var3 >= dk.field_j) {
                        break L51;
                      } else {
                        ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                        ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                        var3++;
                        continue L58;
                      }
                    }
                  }
                }
                return;
              } else {
                cj.a((byte) -23, ke.field_h[17]);
                if (0 == (ah.field_d & 3)) {
                  L59: {
                    L60: {
                      if (ah.field_d >= -1301) {
                        break L60;
                      } else {
                        if (ah.field_d > -1801) {
                          L61: {
                            if (-1306 <= ah.field_d) {
                              break L61;
                            } else {
                              cj.a((byte) 124, ke.field_h[15]);
                              break L61;
                            }
                          }
                          if (-201 >= (dk.field_j ^ -1)) {
                            break L59;
                          } else {
                            ve.field_x[dk.field_j][0] = pf.a((byte) 104, 640);
                            ve.field_x[dk.field_j][1] = pf.a((byte) -100, 480);
                            dk.field_j = dk.field_j + 1;
                            break L59;
                          }
                        } else {
                          break L60;
                        }
                      }
                    }
                    if (-1 >= dk.field_j) {
                      break L59;
                    } else {
                      dk.field_j = dk.field_j - 1;
                      break L59;
                    }
                  }
                  var3 = 0;
                  L62: while (true) {
                    if (var3 >= dk.field_j) {
                      return;
                    } else {
                      ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                      ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                      var3++;
                      continue L62;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              L63: {
                if (0 != (ah.field_d & 3)) {
                  break L63;
                } else {
                  L64: {
                    if ((ah.field_d ^ -1) >= -1301) {
                      if (-1 <= (dk.field_j ^ -1)) {
                        break L64;
                      } else {
                        dk.field_j = dk.field_j - 1;
                        var3 = 0;
                        L65: while (true) {
                          if (var3 >= dk.field_j) {
                            return;
                          } else {
                            ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                            ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                            var3++;
                            continue L65;
                          }
                        }
                      }
                    } else {
                      if (ah.field_d > -1801) {
                        if (-1306 >= ah.field_d) {
                          if (-201 >= (dk.field_j ^ -1)) {
                            break L64;
                          } else {
                            ve.field_x[dk.field_j][0] = pf.a((byte) 104, 640);
                            ve.field_x[dk.field_j][1] = pf.a((byte) -100, 480);
                            dk.field_j = dk.field_j + 1;
                            var3 = 0;
                            L66: while (true) {
                              if (var3 >= dk.field_j) {
                                return;
                              } else {
                                ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                                ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                                var3++;
                                continue L66;
                              }
                            }
                          }
                        } else {
                          cj.a((byte) 124, ke.field_h[15]);
                          if (-201 <= dk.field_j) {
                            var3 = 0;
                            L67: while (true) {
                              if (var3 >= dk.field_j) {
                                return;
                              } else {
                                ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                                ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                                var3++;
                                continue L67;
                              }
                            }
                          } else {
                            ve.field_x[dk.field_j][0] = pf.a((byte) 104, 640);
                            ve.field_x[dk.field_j][1] = pf.a((byte) -100, 480);
                            dk.field_j = dk.field_j + 1;
                            var3 = 0;
                            L68: while (true) {
                              if (var3 >= dk.field_j) {
                                return;
                              } else {
                                ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                                ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                                var3++;
                                continue L68;
                              }
                            }
                          }
                        }
                      } else {
                        if (-1 >= dk.field_j) {
                          var3 = 0;
                          L69: while (true) {
                            if (var3 >= dk.field_j) {
                              return;
                            } else {
                              ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                              ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                              var3++;
                              continue L69;
                            }
                          }
                        } else {
                          dk.field_j = dk.field_j - 1;
                          var3 = 0;
                          L70: while (true) {
                            if (var3 >= dk.field_j) {
                              return;
                            } else {
                              ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                              ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                              var3++;
                              continue L70;
                            }
                          }
                        }
                      }
                    }
                  }
                  var3 = 0;
                  L71: while (true) {
                    if (var3 >= dk.field_j) {
                      break L63;
                    } else {
                      ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                      ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                      var3++;
                      continue L71;
                    }
                  }
                }
              }
              return;
            }
          } else {
            var1 = Math.random();
            if (var1 > 0.95) {
              if (var1 > 0.975) {
                L72: {
                  cj.a((byte) 127, ke.field_h[16]);
                  if (0 != (ah.field_d & 3)) {
                    break L72;
                  } else {
                    L73: {
                      L74: {
                        if (ah.field_d >= -1301) {
                          break L74;
                        } else {
                          if (ah.field_d > -1801) {
                            L75: {
                              if (-1306 <= ah.field_d) {
                                break L75;
                              } else {
                                cj.a((byte) 124, ke.field_h[15]);
                                break L75;
                              }
                            }
                            if (-201 >= (dk.field_j ^ -1)) {
                              break L73;
                            } else {
                              ve.field_x[dk.field_j][0] = pf.a((byte) 104, 640);
                              ve.field_x[dk.field_j][1] = pf.a((byte) -100, 480);
                              dk.field_j = dk.field_j + 1;
                              break L73;
                            }
                          } else {
                            break L74;
                          }
                        }
                      }
                      if (-1 >= dk.field_j) {
                        break L73;
                      } else {
                        dk.field_j = dk.field_j - 1;
                        break L73;
                      }
                    }
                    var3 = 0;
                    L76: while (true) {
                      if (var3 >= dk.field_j) {
                        break L72;
                      } else {
                        ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                        ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                        var3++;
                        continue L76;
                      }
                    }
                  }
                }
                return;
              } else {
                L77: {
                  cj.a((byte) -23, ke.field_h[17]);
                  if (0 != (ah.field_d & 3)) {
                    break L77;
                  } else {
                    L78: {
                      L79: {
                        if (ah.field_d >= -1301) {
                          break L79;
                        } else {
                          if (ah.field_d > -1801) {
                            L80: {
                              if (-1306 <= ah.field_d) {
                                break L80;
                              } else {
                                cj.a((byte) 124, ke.field_h[15]);
                                break L80;
                              }
                            }
                            if (-201 >= (dk.field_j ^ -1)) {
                              break L78;
                            } else {
                              ve.field_x[dk.field_j][0] = pf.a((byte) 104, 640);
                              ve.field_x[dk.field_j][1] = pf.a((byte) -100, 480);
                              dk.field_j = dk.field_j + 1;
                              break L78;
                            }
                          } else {
                            break L79;
                          }
                        }
                      }
                      if (-1 >= dk.field_j) {
                        break L78;
                      } else {
                        dk.field_j = dk.field_j - 1;
                        break L78;
                      }
                    }
                    var3 = 0;
                    L81: while (true) {
                      if (var3 >= dk.field_j) {
                        break L77;
                      } else {
                        ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                        ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                        var3++;
                        continue L81;
                      }
                    }
                  }
                }
                return;
              }
            } else {
              L82: {
                if (0 != (ah.field_d & 3)) {
                  break L82;
                } else {
                  L83: {
                    if ((ah.field_d ^ -1) >= -1301) {
                      if (-1 <= (dk.field_j ^ -1)) {
                        break L83;
                      } else {
                        dk.field_j = dk.field_j - 1;
                        var3 = 0;
                        L84: while (true) {
                          if (var3 >= dk.field_j) {
                            return;
                          } else {
                            ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                            ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                            var3++;
                            continue L84;
                          }
                        }
                      }
                    } else {
                      if (ah.field_d > -1801) {
                        if (-1306 >= ah.field_d) {
                          if (-201 >= (dk.field_j ^ -1)) {
                            break L83;
                          } else {
                            ve.field_x[dk.field_j][0] = pf.a((byte) 104, 640);
                            ve.field_x[dk.field_j][1] = pf.a((byte) -100, 480);
                            dk.field_j = dk.field_j + 1;
                            var3 = 0;
                            L85: while (true) {
                              if (var3 >= dk.field_j) {
                                return;
                              } else {
                                ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                                ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                                var3++;
                                continue L85;
                              }
                            }
                          }
                        } else {
                          L86: {
                            cj.a((byte) 124, ke.field_h[15]);
                            if (-201 <= dk.field_j) {
                              break L86;
                            } else {
                              ve.field_x[dk.field_j][0] = pf.a((byte) 104, 640);
                              ve.field_x[dk.field_j][1] = pf.a((byte) -100, 480);
                              dk.field_j = dk.field_j + 1;
                              break L86;
                            }
                          }
                          var3 = 0;
                          L87: while (true) {
                            if (var3 >= dk.field_j) {
                              return;
                            } else {
                              ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                              ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                              var3++;
                              continue L87;
                            }
                          }
                        }
                      } else {
                        L88: {
                          if (-1 >= dk.field_j) {
                            break L88;
                          } else {
                            dk.field_j = dk.field_j - 1;
                            break L88;
                          }
                        }
                        var3 = 0;
                        L89: while (true) {
                          if (var3 >= dk.field_j) {
                            return;
                          } else {
                            ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                            ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                            var3++;
                            continue L89;
                          }
                        }
                      }
                    }
                  }
                  var3 = 0;
                  L90: while (true) {
                    if (var3 >= dk.field_j) {
                      break L82;
                    } else {
                      ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                      ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                      var3++;
                      continue L90;
                    }
                  }
                }
              }
              return;
            }
          }
        } else {
          L91: {
            L92: {
              hl.field_a = 60;
              if (ah.field_d > -1301) {
                break L92;
              } else {
                if (-1801 >= ah.field_d) {
                  break L91;
                } else {
                  break L92;
                }
              }
            }
            if (dk.field_j != 0) {
              break L91;
            } else {
              if (Math.random() <= 0.99) {
                break L91;
              } else {
                L93: {
                  if (480 >= ne.field_b) {
                    stackOut_109_0 = 0;
                    stackIn_110_0 = stackOut_109_0;
                    break L93;
                  } else {
                    stackOut_108_0 = 1;
                    stackIn_110_0 = stackOut_108_0;
                    break L93;
                  }
                }
                L94: {
                  var1_int = stackIn_110_0;
                  if ((dd.field_e ^ -1) >= -481) {
                    stackOut_112_0 = 0;
                    stackIn_113_0 = stackOut_112_0;
                    break L94;
                  } else {
                    stackOut_111_0 = 1;
                    stackIn_113_0 = stackOut_111_0;
                    break L94;
                  }
                }
                L95: {
                  var2 = stackIn_113_0;
                  if (var1_int == 0) {
                    break L95;
                  } else {
                    if (var2 == 0) {
                      break L95;
                    } else {
                      if (Math.random() >= 0.5) {
                        var1_int = 0;
                        break L95;
                      } else {
                        var2 = 0;
                        break L95;
                      }
                    }
                  }
                }
                L96: {
                  if (var2 == 0) {
                    break L96;
                  } else {
                    dd.field_e = -df.field_q[0].field_n;
                    break L96;
                  }
                }
                if (var1_int != 0) {
                  ne.field_b = -df.field_q[0].field_n;
                  break L91;
                } else {
                  break L91;
                }
              }
            }
          }
          L97: {
            ah.field_d = ah.field_d + 2;
            if ((ah.field_d ^ -1) < -2001) {
              ah.field_d = 0;
              break L97;
            } else {
              break L97;
            }
          }
          L98: {
            if (param0 >= 15) {
              break L98;
            } else {
              field_i = null;
              break L98;
            }
          }
          L99: {
            var1 = Math.random();
            if (var1 > 0.95) {
              if (var1 > 0.975) {
                cj.a((byte) 127, ke.field_h[16]);
                break L99;
              } else {
                cj.a((byte) -23, ke.field_h[17]);
                break L99;
              }
            } else {
              break L99;
            }
          }
          L100: {
            if (0 != (ah.field_d & 3)) {
              break L100;
            } else {
              L101: {
                L102: {
                  if (ah.field_d >= -1301) {
                    break L102;
                  } else {
                    if (ah.field_d > -1801) {
                      L103: {
                        if (-1306 <= ah.field_d) {
                          break L103;
                        } else {
                          cj.a((byte) 124, ke.field_h[15]);
                          break L103;
                        }
                      }
                      if (-201 >= (dk.field_j ^ -1)) {
                        break L101;
                      } else {
                        ve.field_x[dk.field_j][0] = pf.a((byte) 104, 640);
                        ve.field_x[dk.field_j][1] = pf.a((byte) -100, 480);
                        dk.field_j = dk.field_j + 1;
                        break L101;
                      }
                    } else {
                      break L102;
                    }
                  }
                }
                if (-1 >= dk.field_j) {
                  break L101;
                } else {
                  dk.field_j = dk.field_j - 1;
                  break L101;
                }
              }
              var3 = 0;
              L104: while (true) {
                if (var3 >= dk.field_j) {
                  break L100;
                } else {
                  ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                  ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                  var3++;
                  continue L104;
                }
              }
            }
          }
          return;
        }
    }

    final static void g(int param0) {
        oa.field_G = -1;
        if (param0 < 65) {
            vb.f(-26);
            pf.field_b = null;
            ka.field_a = 0;
            nj.field_a = -1;
            ac.field_b = false;
            return;
        }
        pf.field_b = null;
        ka.field_a = 0;
        nj.field_a = -1;
        ac.field_b = false;
    }

    final static void a(int param0, bk param1, boolean param2) {
        hb var3 = gf.field_c;
        var3.b(param2, param0);
        var3.b(2, -49152);
        var3.b(0, -49152);
        var3.b(param1.field_e, -49152);
    }

    vb() {
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param0 <= 62) {
            return 28;
        }
        if (!(0 == (7 & param1))) {
            var2 = -(param1 & 7) + 8;
        }
        int var3 = param1 + var2;
        return var3;
    }

    public static void e(int param0) {
        int var1 = -105 % ((param0 - 14) / 34);
        field_i = null;
    }

    final static void a(byte param0) {
        String var1 = null;
        if (!fk.field_a) {
            throw new IllegalStateException();
        }
        if (null != me.field_f) {
            me.field_f.g((byte) -75);
            var1 = hf.b(0);
            j.field_e = new qi(var1, (String) null, true, false, false);
            if (param0 == 28) {
                wg.field_j.b((byte) -54, (we) (Object) jh.field_C);
                jh.field_C.c((byte) 119, (we) (Object) j.field_e);
                jh.field_C.p(-21);
                return;
            }
            field_i = null;
            wg.field_j.b((byte) -54, (we) (Object) jh.field_C);
            jh.field_C.c((byte) 119, (we) (Object) j.field_e);
            jh.field_C.p(-21);
            return;
        }
        var1 = hf.b(0);
        j.field_e = new qi(var1, (String) null, true, false, false);
        if (param0 != 28) {
            field_i = null;
            wg.field_j.b((byte) -54, (we) (Object) jh.field_C);
            jh.field_C.c((byte) 119, (we) (Object) j.field_e);
            jh.field_C.p(-21);
            return;
        }
        wg.field_j.b((byte) -54, (we) (Object) jh.field_C);
        jh.field_C.c((byte) 119, (we) (Object) j.field_e);
        jh.field_C.p(-21);
    }

    final static boolean a(byte param0, char param1) {
        if (!Character.isISOControl(param1)) {
          if (!th.a(false, param1)) {
            if (param1 != 45) {
              if (160 != param1) {
                if (32 == param1) {
                  return true;
                } else {
                  if (param1 != 95) {
                    if (param0 >= 109) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Waiting for graphics";
    }
}
